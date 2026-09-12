package NewFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
  1. Lunch Browser (Chrome)
  2. Open URL https://demo.opencart.com
  3. Validate Title should be "Your Store"
  4. Close Browser
 */

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		// Lunch Browser (Chrome)
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Open URL https://demo.opencart.com
		driver.get("https://www.saucedemo.com");
		
		// Validate Title should be "Swag Labs"
		String act_title = driver.getTitle();
		
		if(act_title.equals("Swag Labs")) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		// Valid Login user test case
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		
		// Validate successful login
        String actualText = driver.findElement(By.className("title")).getText();

        if (actualText.equals("Products")) {
            System.out.println("Login Test Passed");
        } else {
            System.out.println("Login Test Failed");
        }
		
        List<WebElement> products = driver.findElements(By.className("inventory_item"));
        System.out.println("Number of products on Page: "+products.size());
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Number of links on Page: "+links.size());
        
		// Close Browser
		//driver.close();
		driver.quit();
	}

}
