package Web;

public class InetAddressTest1 {
    public static void main(String[] args) {
        // port 0~65535 (app needs to register port, can't be same as others)
        // 0~1023 (HTTP: 80, FTP: 21)
        // 1024~49151 (User APP)
        // 49152~65535 (flexible)
    }
}
