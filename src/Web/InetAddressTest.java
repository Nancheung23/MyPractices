package Web;

import java.net.InetAddress;

public class InetAddressTest {
    public static void main(String[] args) throws Exception {
        // get localhost
        String localHost = InetAddress.getLocalHost().toString();
        System.out.println("LocalHost: " + localHost);

        // get ByName
        try {
            InetAddress ip1 = InetAddress.getByName("www.google.com");
            // check if isReachable
            if (ip1.isReachable(5000)) {
                // get host name
                System.out.println("HostName: " + ip1.getHostName());

                // get host address
                System.out.println("Host address: " + ip1.getHostAddress());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
