package specialFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

public class propertiesTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            // load
            properties.load(new FileReader("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\specialFile\\test.properties"));
            System.out.println(properties);

            // get
            System.out.println(properties.getProperty("nancheung"));
            
            // stringPropertyNames (for: & forEach)
            Set<String> keys = properties.stringPropertyNames();
            for(String key : keys) {
                String value = properties.getProperty(key);
                System.out.println(value);
            }
            properties.forEach((k, v) -> System.out.println(k + " : " + v));

            // setProperty
            properties.setProperty("abc", "ABC");
            properties.setProperty("def", "DEF");
            properties.setProperty("ghi", "GHI");

            // store
            properties.store(new FileWriter("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\specialFile\\testCopy.properties"), "saved properties");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
