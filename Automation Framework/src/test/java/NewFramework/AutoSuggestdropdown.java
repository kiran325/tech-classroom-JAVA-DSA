package NewFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=815461296140&hvpos=&hvnetw=g&hvrand=3190815886048672623&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-64107830&hydadcr=14452_2462829&mcid=e9c68a2d0f333bcaacd29ec00843c329&hvocijid=3190815886048672623--&hvexpln=nav&gad_source=1");
		Thread.sleep(3000);
		// Enter search text
        driver.findElement(By.name("field-keywords"))
              .sendKeys("puma running shoes");

        // Wait for suggestions
        Thread.sleep(3000);

        // Locate suggestions
        List<WebElement> options = driver.findElements(
                By.xpath("//div[contains(@class,'s-suggestion') and @role='button']")
        );

        System.out.println("Suggestion count: " + options.size());

        boolean found = false;
        
        // Print all Suggestions
        for (WebElement option : options) {

            String text = option.getText().trim();

            System.out.println("Suggestion: " + text);
        }

        // Print all suggestions
        for (WebElement option : options) {
        	String text = option.getText().trim();

            if (text.equalsIgnoreCase("puma running shoes")) {
                option.click();
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Test Case Passed");
        } else {
            System.out.println("Test Case Failed - Suggestion not found");
        }

        driver.quit();
	}

}
