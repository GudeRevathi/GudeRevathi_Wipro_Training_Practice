package com.example.Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
 
public class CrossBrowserTest {
   public static WebDriver driver;
   public static void main(String[] args) {
       // Set the browser to test
       String browser = "edge"; 
 
       // Launch the desired browser
       switch (browser.toLowerCase()) {
           case "chrome":
               //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
               driver = new ChromeDriver();
               break;
           case "firefox":
               //System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
               driver = new FirefoxDriver();
               break;
           case "edge":
               System.setProperty("webdriver.edge.driver", "C:\\Users\\revat\\msedgedriver.exe");
               driver = new EdgeDriver();
               break;
           default:
              System.out.println("Unsupported browser!");
              return;
       }
 
       // Navigate to a website and perform actions
      driver.get("https://example.com");
      System.out.println("Title: " + driver.getTitle());
 
       // Close the browser
       driver.quit();
   }
}