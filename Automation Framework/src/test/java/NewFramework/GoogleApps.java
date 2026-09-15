package NewFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleApps {

    public static void main(String[] args) {

        // 1. Launch Chrome
        WebDriver driver = new ChromeDriver();

        // 2. Create explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // 3. Open Google
        driver.get("https://www.google.com");

        // 4. Maximize browser
        driver.manage().window().maximize();

        // 5. Click Google Apps icon
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("a[aria-label='Google apps']")))
                .click();

        // 6. Switch to Google Apps iframe
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                By.cssSelector("iframe[src*='ogs.google.com']")));

        // 7. Click YouTube
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//li/a//span[normalize-space()='YouTube']")))
                .click();

        // 8. Quit browser
        driver.quit();
        
        System.out.println("TestCase Passed");
    }
}