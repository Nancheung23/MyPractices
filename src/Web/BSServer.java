package Web;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class BSServer {
    public static void main(String[] args) throws Exception{
        System.out.println("=== Server started ===");
        // create pool
        ThreadPoolExecutor pool= new ThreadPoolExecutor(16 * 2, 16 * 2 , 0,
        TimeUnit.SECONDS, new ArrayBlockingQueue<>(8), 
        Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
            while (true) {
                try (ServerSocket serverSocket = new ServerSocket(8080)) {
                    Socket socket = serverSocket.accept();
                    System.out.println(socket.getRemoteSocketAddress() + ": Online");


                    pool.execute(new BServerReaderRunnable(socket));
                }
            }
    }
}