package core;

import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    private static final Properties properties;



    static {
        properties = new Properties();
        try {
            properties.load(ReadProperties.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUrl() {
        return properties.getProperty("url");
    }

    public static String browserName() {
        return properties.getProperty("browser");
    }

    public static String username() {
        return properties.getProperty("username");
    }

    public static String password() {
        return properties.getProperty("password");
    }

    public static boolean isHeadless() {
        return properties.getProperty("headless").equalsIgnoreCase("true");
    }

    public static int timeout() {
        return  Integer.parseInt(properties.getProperty("timeout"));}

    public static String host(){ return  properties.getProperty("HOST");}
    public static String port(){ return  properties.getProperty("PORT");}
    public static String userDB(){ return  properties.getProperty("User");}
    public static String pswDB(){ return  properties.getProperty("PSWDB");}
    public static String dbName(){ return  properties.getProperty("DataBaseName");}
    public static String jdbc(){ return  properties.getProperty("JDBC"+host()+":"+port()+"/"+dbName());}
}
