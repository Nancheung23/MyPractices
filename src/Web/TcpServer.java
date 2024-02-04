package Web;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws Exception {
        // create
        ServerSocket serverSocket = new ServerSocket(8888);
        // accept
        Socket socket = serverSocket.accept();
        // inputStream
        InputStream is = socket.getInputStream();
        // is -> data is
        DataInputStream dis = new DataInputStream(is);
        try {
            while (true) {
                String rs = dis.readUTF();
                System.out.println(socket.getRemoteSocketAddress() + ": " + rs);
            }
        } catch (Exception e) {
            throw new EOFException("Web socket closed by client");
        } finally {
            // close (ignore)
            dis.close();
            serverSocket.close();
        }
    }
}
