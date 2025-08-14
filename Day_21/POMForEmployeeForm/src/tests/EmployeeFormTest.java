package tests;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import pages.EmployeeFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class EmployeeFormTest {
   public static void main(String[] args) {
       //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
       WebDriver driver = new ChromeDriver();
 
      
try {
          driver.get("file:///C:/Users/revat/OneDrive/Desktop/Java/HTML/Employee_Data.html");
 
           // Step 1: Initialize the Page Object
           EmployeeFormPage formPage = new EmployeeFormPage(driver);
 
           // Step 2: Use page methods
           formPage.enterEmpId("100");
          formPage.enterEmpName("Revathi");
          formPage.enterDOB("2001-01-11");
          formPage.enterAddress("123 ABC");
          formPage.enterContactNo("7777777777");
          formPage.enterEmail("harry@example.com");
          formPage.clickSubmit();
 
        
          // Trigger the alert
            driver.findElement(By.id("triggerAlert")).click();

             // Switch to alert
             Alert alert = driver.switchTo().alert();

             // Read alert text
             String alertMessage = alert.getText();
             System.out.println("Alert message: " + alertMessage);

             // Accept the alert
             alert.accept();
 
       } catch (Exception e) {
          e.printStackTrace();
       } finally {
          //driver.quit();
       }
   }
}
