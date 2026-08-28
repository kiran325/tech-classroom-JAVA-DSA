package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * THIS IS INTENTIONALLY A "BAD" TEST.
 *
 * Everything is hardcoded in ONE method:
 * - The URL
 * - The locators (By.id, By.name etc.)
 * - The actions
 *
 * Why is this bad? Imagine you had 50 tests like this, and the website's
 * search box ID changed from "search-box" to "searchInput" tomorrow.
 * You'd have to manually go and fix that locator in ALL 50 files.
 *
 * This is EXACTLY the pain that Page Object Model (Step 4) solves.
 * For now, just get this running and understand each line.
 */
public class MyFirstRawTest {

    @Test
    public void openSauceDemoAndLogin() {

        // STEP 1: Tell WebDriverManager to auto-download the correct
        // ChromeDriver version that matches your installed Chrome browser.
        // Before this library existed, you had to do this manually every
        // time Chrome auto-updated -- a constant source of broken pipelines.
        WebDriverManager.chromedriver().setup();

        // STEP 2: Create the actual WebDriver object.
        // This line physically opens a Chrome browser window on your screen.
        WebDriver driver = new ChromeDriver();

        // STEP 3: Maximize the window (good practice -- some elements
        // only render correctly at full screen size)
        driver.manage().window().maximize();

        // STEP 4: Navigate to the site under test
        driver.get("https://www.saucedemo.com/");

        // STEP 5: Locate the username field using its HTML "id" attribute,
        // then type into it using sendKeys()
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        // STEP 6: Locate the password field and type into it
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        // STEP 7: Locate the login button and click it
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // STEP 8: Grab the page title after login to prove we landed
        // on the right page, and print it to console
        String pageTitle = driver.getTitle();
        System.out.println("Page title after login: " + pageTitle);

        // STEP 9: Always close the browser at the end, or it stays
        // open and eats memory. quit() closes ALL windows + kills
        // the driver session. close() only closes the current window.
        driver.quit();
    }
}
