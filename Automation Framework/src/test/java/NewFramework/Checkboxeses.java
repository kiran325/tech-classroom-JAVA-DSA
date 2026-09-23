package NewFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxeses {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		for(WebElement checkbox:checkboxes ) {
			checkbox.click();	
		}
		
		System.out.println("All checkbox Checked");
		Thread.sleep(3000);
		
		for(WebElement checkbox: checkboxes) {
			if(checkbox.isSelected()) {
				checkbox.click();
			}
		}
		
		System.out.println("All checkbox Unchecked");
		driver.quit();
				
	}

}
