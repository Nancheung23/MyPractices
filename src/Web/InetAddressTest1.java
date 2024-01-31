package Web;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class InetAddressTest1 {
    public static void main(String[] args) throws Exception{
        // port 0~65535 (app needs to register port, can't be same as others)
        // 0~1023 (HTTP: 80, FTP: 21)
        // 1024~49151 (User APP)
        // 49152~65535 (flexible)

        // UDP： DatagramSocket(int port)
        DatagramSocket socket = new DatagramSocket();
        byte[] bytes = "I am the client".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length,InetAddress.getLocalHost(),6666);
        // send(DatagramPacket dp)
        socket.send(packet);
        // receive(DatagramPacket p)

        // release resource
        System.out.println("Already sent packet");
        socket.close();

    }
}
