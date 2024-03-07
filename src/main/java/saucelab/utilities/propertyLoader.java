package saucelab.utilities;

import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyLoader {
    public String configPropertyLoader(String in) {
        FileInputStream fis = null;
        Properties locator = null;
        try {
            fis = new FileInputStream("src/main/java/saucelab/propertyFiles/config.properties");
            locator = new Properties();
            locator.load(fis);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        String out = (String) locator.get(in);
        return out;
    }
    public String pageTextLoader(String in) {
        FileInputStream fis = null;
        Properties locator = null;
        try {
            fis = new FileInputStream("src/main/java/saucelab/propertyFiles/locators.properties");
            locator = new Properties();
            locator.load(fis);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        String out = (String) locator.get(in);
        return out;
    }
    public By pagePropertyLoader(String in) {
        FileInputStream fis = null;
        Properties locator = null;
        By output=null;
        try {
            fis = new FileInputStream("src/main/java/saucelab/propertyFiles/locators.properties");
            locator = new Properties();
            locator.load(fis);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        assert locator != null;
        String out = (String) locator.get(in);
        output=By.xpath(out);
        return output;
    }
}