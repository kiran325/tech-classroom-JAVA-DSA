package NewFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com");
		
		// Normal alert with OK button
		
		driver.findElement(By.xpath("//*[@id=\"alertBtn\"]")).click();
		Thread.sleep(3000);
		Alert mylert = driver.switchTo().alert();
		System.out.println(mylert.getText());
		mylert.accept();
		
		// Confirmation Alert - OK or Cancel
		
		driver.findElement(By.xpath("//*[@onclick='myFunctionConfirm()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		String SucessfulMessage = driver.findElement(By.xpath("//p")).getText();
		System.out.println(SucessfulMessage);
		// Verify expected text
		
		String expectedString = "Congratulations! You must have the proper credentials.";
		if(SucessfulMessage.equals(expectedString)) {
			System.out.println("TestCase Passed");
		}
		else {
			System.out.println("TestCase Failed");
		}
		
		// Even better: use contains() For UI verification, you can also do:
		boolean result = driver.getPageSource().contains(
			    "Congratulations! You must have the proper credentials."
			);
		
		driver.quit();
	}

}
