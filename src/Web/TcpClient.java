package Web;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {
    public static void main(String[] args) throws Exception{
        // create
        Socket socket = new Socket("127.0.0.1", 8888);
        // new Thread
        new ClientReaderThread(socket).start();
        // stream to server
        OutputStream os = socket.getOutputStream();
        // os -> data os
        DataOutputStream dos = new DataOutputStream(os);
        // write data
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please input: ");
            String msg = scanner.nextLine();
            if (msg.equalsIgnoreCase("exit")) {
                System.out.println("quit successfully");
                scanner.close();
                dos.close();
                socket.close();
                break;
            }
            dos.writeUTF(msg);
            dos.flush();
        }
        // close
        scanner.close();
        dos.close();
        socket.close();
    }
}
