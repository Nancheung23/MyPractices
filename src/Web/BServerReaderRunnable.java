package Web;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class BServerReaderRunnable implements Runnable{
    private Socket socket;

    public BServerReaderRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=UTF-8");
            ps.println();
            ps.println("<div style='color:red;font-size:120px;text-align:center'>This is BS communication<div>");
            ps.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
