package Web;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class TcpMultiThreadServer {
    public static List<Socket> onlineSockets = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        System.out.println("=== Server launched successfully ===");
        try (// create
        ServerSocket serverSocket = new ServerSocket(8888)) {
            while (true) {
                Socket socket = serverSocket.accept();
                onlineSockets.add(socket);
                System.out.println("User login: " + socket.getRemoteSocketAddress());
                // thread handle
                new ServerReaderThread(socket).start();
            }
        }
    }
}
