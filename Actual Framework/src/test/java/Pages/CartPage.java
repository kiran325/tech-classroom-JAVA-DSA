package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage {

    private WebDriver driver;

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    @FindBy(id = "continue-shopping")
    private WebElement continueShoppingButton;

    // A LIST of elements -- there can be multiple product rows in the cart,
    // so we grab all of them rather than a single WebElement.
    @FindBy(css = ".cart_item .inventory_item_name")
    private List<WebElement> cartItemNames;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Checks whether a specific product name appears somewhere in the cart.
    // Loops through all product name elements and compares text.
    public boolean isProductInCart(String productName) {
        for (WebElement item : cartItemNames) {
            if (item.getText().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }

    public int getNumberOfItemsInCart() {
        return cartItemNames.size();
    }

    public void clickCheckout() {
        checkoutButton.click();
    }

    public void clickContinueShopping() {
        continueShoppingButton.click();
    }
}

