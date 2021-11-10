package com.live_project_frontend.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

        public static String readProperty(String property){
            Properties prop = null;
            try{
                FileInputStream fileInput = new FileInputStream("src/test/resources/config.properties");
                prop = new Properties();
                prop.load(fileInput);

            }catch (IOException e){
                e.printStackTrace();
            }
            return prop.getProperty(property);
        }


}
