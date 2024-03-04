package Web;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run(){
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true) {
                try {
                    String rs = dis.readUTF();
                    System.out.println(socket.getRemoteSocketAddress() + ": " + rs);
                    sendMsgToAll(rs);
                    if (rs.equalsIgnoreCase("exit")) {
                        dis.close();
                        socket.close();
                        break;
                    } 
                } catch (Exception e) {
                    TcpMultiThreadServer.onlineSockets.remove(socket);
                    dis.close();
                    socket.close();
                    System.out.println("User disconnected:" + socket.getRemoteSocketAddress());
                    break;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    synchronized private void sendMsgToAll(String rs) throws Exception{
        for(Socket onlineSocket : TcpMultiThreadServer.onlineSockets) {
            OutputStream os = onlineSocket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(rs);
            dos.flush();
        }
    }
}
