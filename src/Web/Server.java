package Web;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws Exception{
        System.out.println("server run");
        DatagramSocket socket = new DatagramSocket(6666);

        // for receive constructor
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        // receive(DatagramPacket p)
        socket.receive(packet);

        int len = packet.getLength();
        String rs = new String(buffer, 0, len);
        System.out.println(rs);

        System.out.println(packet.getAddress().getHostAddress());
        System.out.println(packet.getPort());

        socket.close();
    }
}
