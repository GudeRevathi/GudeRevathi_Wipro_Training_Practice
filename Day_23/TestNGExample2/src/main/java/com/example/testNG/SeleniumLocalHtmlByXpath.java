package com.example.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import java.io.File;
 
public class SeleniumLocalHtmlByXpath {
   public static void main(String[] args) throws InterruptedException {
 
        // Initialize WebDriver
       WebDriver driver = new ChromeDriver();
 
       // Build a file:// URL for the local HTML
       File htmlFile = new File("C:\\Users\\\\revat\\OneDrive\\Desktop\\Java\\HTML\\myhtml.html");
       String url = "file:///" + htmlFile.getAbsolutePath();
 
       // Open the local HTML file
      driver.get(url);
 
       // Locate the text field with XPath and type something
       WebElement inputField = driver.findElement(By.xpath("//input[@id='searchBox']"));
      inputField.sendKeys("Hello Learners!");
 
       // Locate the button with XPath and click it
       WebElement searchButton = driver.findElement(By.xpath("//button[@class='search-button']"));
      searchButton.click();
 
       // Wait a few seconds so you see the result
      Thread.sleep(3000);
      driver.quit();
   }
}
 
