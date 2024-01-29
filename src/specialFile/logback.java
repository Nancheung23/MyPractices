package specialFile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class logback {
    public static final Logger LOGGER = LoggerFactory.getLogger("LogBackTest");
    public static void main(String[] args) {
        // logback -> interface: SLF4J : logback-core, logback-classic, logback-access
        int times = 0;
        while (times < 10000) {
            try {
                LOGGER.info("divide start");
                divide(10, 0);
                LOGGER.info("execute successfully");
            } catch (Exception e) {
                LOGGER.error("Bug",e);
            } finally {
                times ++;
            }
        }
    }

    public static void divide(int a, int b) {
        LOGGER.debug("factor 1:" + a);
        LOGGER.debug("factor 2:" + b);
        int c = a / b;
        System.out.println(c);
        LOGGER.info("result: " + c);
    }
}
