package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * PAGE OBJECT for the final "Thank You" order confirmation page.
 */
public class CheckoutCompletePage {

    private WebDriver driver;

    @FindBy(css = ".complete-header")
    private WebElement completeHeader;

    @FindBy(id = "back-to-products")
    private WebElement backHomeButton;

    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getConfirmationMessage() {
        return completeHeader.getText();
    }

    public void clickBackHome() {
        backHomeButton.click();
    }
}
