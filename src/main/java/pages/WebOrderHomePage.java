package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebOrderHomePage extends BasePage {

    @FindBy(linkText = "View all orders")
    private WebElement viewAllOrdersLink;

    @FindBy(linkText = "View all products")
    private WebElement viewAllProductsLink;

    @FindBy(linkText = "Order")
    private WebElement orderLink;

    public WebOrderHomePage() {
        super();
    }

    public void navigateToViewAllOrders() {
        viewAllOrdersLink.click();
    }

    public void navigateToOrder() {
        orderLink.click();
    }

    public void navigateToAllProducts() {
        viewAllProductsLink.click();
    }
}