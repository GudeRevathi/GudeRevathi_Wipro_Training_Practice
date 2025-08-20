package com.example.testNG;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
 
import java.time.Duration;
 
public class WaitHandlingExample {
   public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
 
       try {
          driver.get("file://C://Users//revat//OneDrive//Desktop//Java//HTML//exaple.html");
 
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("User")));
          element.click();
       } catch (TimeoutException e) {
          System.out.println("Element was not visible in time: " + e.getMessage());
       } finally {
          driver.quit();
       }
   }
}

