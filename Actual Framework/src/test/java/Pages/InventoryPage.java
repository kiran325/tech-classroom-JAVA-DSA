package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * PAGE OBJECT for the Inventory (product listing) page.
 * This is the page you land on immediately after a successful login.
 */
public class InventoryPage {

    private WebDriver driver;

    @FindBy(css = ".shopping_cart_badge")
    private WebElement cartBadge;

    @FindBy(css = ".shopping_cart_link")
    private WebElement cartIcon;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement hamburgerMenuButton;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutLink;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Adds a product to the cart using its "Add to Cart" button.
     * SauceDemo builds each button's id from the product name, e.g.
     * "Sauce Labs Backpack" -> id="add-to-cart-sauce-labs-backpack"
     *
     * Instead of hardcoding 6 separate @FindBy elements (one per product),
     * we build the locator dynamically. This is a common real-world POM
     * technique for lists of similar items.
     */
    public void addProductToCart(String productId) {
        WebElement addButton = driver.findElement(By.id("add-to-cart-" + productId));
        addButton.click();
    }

    public void removeProductFromCart(String productId) {
        WebElement removeButton = driver.findElement(By.id("remove-" + productId));
        removeButton.click();
    }

    // Returns the number shown on the cart badge, e.g. "1", "2".
    // If NO items are in the cart, the badge doesn't exist at all --
    // so callers should check getCartItemCount() carefully (we handle
    // the "badge not present" case here so tests don't crash).
    public String getCartItemCount() {
        try {
            return cartBadge.getText();
        } catch (Exception e) {
            return "0"; // badge element doesn't exist when cart is empty
        }
    }

    public void goToCart() {
        cartIcon.click();
    }

    public void openHamburgerMenu() {
        hamburgerMenuButton.click();
    }

    public void logout() {
        openHamburgerMenu();
        logoutLink.click();
    }
}
