package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * BASE TEST CLASS -- every test class will EXTEND this instead of
 * repeating driver setup/teardown logic in each file.
 *
 * WHY THIS MATTERS: Right now we have 5 smoke tests. Without this base
 * class, each one would duplicate the exact same 4 lines of driver setup
 * and 1 line of teardown. With 50 tests later, that's 50 copies of
 * identical code -- a maintenance nightmare if setup logic ever changes
 * (e.g., switching to headless mode, or adding browser options).
 */
public class BaseTest {

    // 'protected' so subclasses (actual test classes) can access
    // this driver instance directly.
    protected WebDriver driver;

    // Hardcoded for now -- in Step 6 we'll externalize this into
    // qa.properties / uat.properties / prod.properties so the SAME
    // test can run against any of the 3 environments.
    protected String baseUrl = "https://www.saucedemo.com/";

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

