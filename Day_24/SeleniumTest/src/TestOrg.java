import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class TestOrg {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            driver.get("https://o3.openmrs.org/openmrs/spa/login");

            System.out.println("Navigated to OpenMRS login page successfully.");

            WebElement usernameField = driver.findElement(By.id("username"));
            usernameField.sendKeys("admin");

            WebElement continueButton = driver.findElement(By.xpath("//button[text()='Continue']"));
            continueButton.click();

            Thread.sleep(2000);

            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("Admin123");

            WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
            submitButton.click();

            System.out.println("Login button clicked successfully.");

            Thread.sleep(5000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            Object result = js.executeScript("return navigator.webdriver;");
     
            System.out.println("navigator.webdriver: " + result);

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (driver != null) {
                //driver.quit();
                System.out.println("Browser closed.");
            }
        }
    }
}
