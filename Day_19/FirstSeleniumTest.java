import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe"); 
//        WebDriver driver = new ChromeDriver(); 
//        driver.get("https://www.google.com"); 
//        System.out.println("Title: " + driver.getTitle()); 
//        driver.quit(); 
		WebDriver driver=null; 
		try {
		// Launch Chrome browser
		driver = new ChromeDriver();
 
		// Go to Google
		driver.get("https://www.google.com");
 
		// Find the search box and type a query
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Amozone");
 
		// Submit the search form
		searchBox.submit();
 
		// Wait a bit (basic pause, not best practice)
			Thread.sleep(10000); // Wait 10 seconds for results to load
		} catch (InterruptedException e) {
			// e.printStackTrace();
		}
		System.out.println("Search Results Page Title: " + driver.getTitle());
	}
}
