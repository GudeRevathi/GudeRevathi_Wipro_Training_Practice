package com.example.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
 
public class IframeExample {
 
   @SuppressWarnings("unused")
   public static void main(String[] args) throws InterruptedException {
	   
	    // Initialize WebDriver
	    WebDriver driver = new ChromeDriver();

	    // Load local main.html
	    File file = new File("C:\\Users\\revat\\OneDrive\\Desktop\\Java\\HTML\\main.html");
	    String url = "file:///" + file.getAbsolutePath();
	    driver.get(url);

	    // First iframe (myFrame)
	    driver.switchTo().frame("myFrame");
	    WebElement messageInput = driver.findElement(By.id("message"));
	    messageInput.sendKeys("Hello Learners!!!!");

	    // Second iframe (myFrame1)
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("myFrame1");
	    WebElement messageInput1 = driver.findElement(By.id("message"));
	    messageInput1.sendKeys("Java Learners!!!!"); 

	    // Third iframe (myFrame2)
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("myFrame2");
	    WebElement messageInput2 = driver.findElement(By.id("message"));
	    messageInput2.sendKeys("Learners!!!!"); 

	    // Optionally: wait to visually confirm
	    Thread.sleep(1000);

	    driver.switchTo().defaultContent();
	    // driver.quit(); // Optional
	}
}
