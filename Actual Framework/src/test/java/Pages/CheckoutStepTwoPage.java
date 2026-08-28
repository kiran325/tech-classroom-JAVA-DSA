package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * PAGE OBJECT for Checkout Step Two -- the Order Overview / Summary page
 * (shows item total, tax, total, and the Finish button).
 */
public class CheckoutStepTwoPage {

    private WebDriver driver;

    @FindBy(id = "finish")
    private WebElement finishButton;

    @FindBy(id = "cancel")
    private WebElement cancelButton;

    @FindBy(css = ".summary_total_label")
    private WebElement totalLabel;

    public CheckoutStepTwoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickFinish() {
        finishButton.click();
    }

    public void clickCancel() {
        cancelButton.click();
    }

    public String getTotalText() {
        return totalLabel.getText();
    }
}

