package NewFramework;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        // Open Google
        driver.get("https://www.google.com/");
        
     // 2. Click "About"
        driver.findElement(By.linkText("About")).click();

        // 3. Go back to Google
        driver.navigate().back();

        // 4. Go forward to About page
        driver.navigate().forward();

        // 5. Refresh About page
        driver.navigate().refresh();
        

        // Get current window handle
        String parentWindow = driver.getWindowHandle();

        // Open a NEW browser window
        driver.switchTo().newWindow(WindowType.WINDOW);
        
        // Open another website in the new window
        driver.get("https://www.amazon.com/");
        
        
        //String parentWindow = driver.getWindowHandle();
        //System.out.println(parentWindow);
        
        Set<String> windows = driver.getWindowHandles();

        for(String window : windows) {
            System.out.println(window);
        }

        driver.quit();
        System.out.println("Test case Passed");  

	}

}
