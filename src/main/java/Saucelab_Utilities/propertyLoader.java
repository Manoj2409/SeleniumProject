package Saucelab_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyLoader {
    public String propertyLoading(String in){
        FileInputStream fis = null;
        Properties locator = null;
        try {
            fis = new FileInputStream("src/main/java/Utilities/config.properties");
            locator = new Properties();
            locator.load(fis);
        } catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String out= (String) locator.get(in);
            return out;
        }

    }
}
