package com.example.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
import java.io.File;
 
public class LocalDragAndDrop {
   public static void main(String[] args) throws InterruptedException {
  
WebDriver driver = new ChromeDriver();
// Load local HTML
       File file = new File("C:\\Users\\revat\\OneDrive\\Desktop\\Java\\HTML\\dragdrop.html");
       String url = "file:///" + file.getAbsolutePath();
      driver.get(url);
 
       WebElement dragElement = driver.findElement(By.id("drag"));
       WebElement dropElement = driver.findElement(By.id("drop"));
 
       Actions actions = new Actions(driver);
       Thread.sleep(1000);
      actions.dragAndDrop(dragElement, dropElement).perform();
      
       //driver.quit();
   }
}
