package com.example.testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestWithTestNGFramework {

    WebDriver driver;

    @BeforeClass
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void openBrowser() {
        // Open local HTML file
        driver.get("C:\\Users\\revat\\OneDrive\\Desktop\\Java\\HTML\\Employee_Data.html");
        System.out.println("Opened local HTML file: " + driver.getCurrentUrl());
    }

    @Test(description = "This method validates the employee form submission")
    public void fillEmployeeForm() throws InterruptedException {
        // Fill form fields
        driver.findElement(By.id("empId")).sendKeys("101");
        driver.findElement(By.id("empName")).sendKeys("John Doe");
        driver.findElement(By.id("email")).sendKeys("john.doe@example.com");
        driver.findElement(By.id("dob")).sendKeys("1995-07-20");
        driver.findElement(By.id("address")).sendKeys("123 Main Street");
        driver.findElement(By.id("mobile")).sendKeys("9876543210");

        // Submit form
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Wait for alert and accept it
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }

    @AfterMethod
    public void postFormSubmission() {
        System.out.println("After Method URL: " + driver.getCurrentUrl());
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
