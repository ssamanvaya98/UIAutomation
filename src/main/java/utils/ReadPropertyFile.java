package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

    public static String getProperty(String key) throws IOException {
        Properties properties = new Properties();
        //Available as part of java ^
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"src/main/resources/config.properties"); // Have to pass the path of properties
        properties.load(file);
        String value = properties.getProperty(key);
        return value;
    }
}
