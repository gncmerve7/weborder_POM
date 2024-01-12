package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OrderPage extends BasePage {
    @FindBy(id = "productSelect")
    private WebElement dropdownElement;

    @FindBy(id = "quantityInput")
    private WebElement quantityInputField;

    @FindBy(id = "discountInput")
    private WebElement discountInputField;

    @FindBy(id = "totalInput")
    private WebElement totalPriceField;

    @FindBy(xpath = "//button[text()='Calculate']")
    private WebElement calculateButton;


    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "street")
    private WebElement streetField;

    @FindBy(id = "city")
    private WebElement cityField;

    @FindBy(id = "state")
    private WebElement stateField;

    @FindBy(id = "zip")
    private WebElement zipCodeField;


    @FindBy(id = "visa")
    private WebElement visaCheckbox;

    @FindBy(id = "MasterCard")
    private WebElement masterCardCheckbox;

    @FindBy(id = "American Express")
    private WebElement americanExpressCheckbox;

    @FindBy(id = "cardNumber")
    private WebElement cardNumberField;

    @FindBy(id = "expiryDate")
    private WebElement expireDateField;


    @FindBy(xpath = "//button[text()='Process']")
    private WebElement processButton;

    public OrderPage() {

        super();
    }

    public void selectProduct(String productName) {
        Select productDropDown = new Select(dropdownElement);
        productDropDown.selectByVisibleText(productName);
    }

    public void enterQuantity(String quatity) {
        quantityInputField.clear();
        quantityInputField.sendKeys(quatity);
    }

    public void enterDiscount(String discount) {
        discountInputField.clear();
        discountInputField.sendKeys(discount);
    }

    public void clickOnCalculateButton() {

        calculateButton.click();
    }

    public String calculatePrice(String productName, String quatity, String discount) {
        selectProduct(productName);
        enterQuantity(quatity);
        enterDiscount(discount);
        clickOnCalculateButton();
        return totalPriceField.getAttribute("value");
    }

    public void enterProduct(String productName, String quatity, String discount) {
        selectProduct(productName);
        enterQuantity(quatity);
        enterDiscount(discount);
        clickOnCalculateButton();
    }

    public void enterCustomerInfo(String name, String street, String city, String state, String zip) {
        enterName(name);
        enterStreet(street);
        enterCity(city);
        enterState(state);
        enterZipCode(zip);
    }

    public void enterName(String name) {
        nameField.clear();
        nameField.sendKeys(name);
    }

    public void enterStreet(String street) {
        streetField.clear();
        streetField.sendKeys(street);
    }

    public void enterCity(String city) {
        cityField.clear();
        cityField.sendKeys(city);
    }

    public void enterState(String state) {
        stateField.clear();
        stateField.sendKeys(state);
    }

    public void enterZipCode(String zipCode) {
        zipCodeField.clear();
        zipCodeField.sendKeys(zipCode);
    }

    public void selectPaymentMethod(String paymentMethod) {
        switch (paymentMethod.toLowerCase()) {
            case "visa":
                clickCheckBox(visaCheckbox);
                break;
            case "mastercard":
                clickCheckBox(masterCardCheckbox);
                break;
            case "amarican express":
                clickCheckBox(americanExpressCheckbox);
                break;
            default:
                System.out.println("Payment method doesn't exist");
                break;
        }
    }

    private void clickCheckBox(WebElement checkbox) {
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public void enterCardNumber(String cardNumber) {
        cardNumberField.clear();
        cardNumberField.sendKeys(cardNumber);
    }


    public void enterExpireDate(String expiryDate) {
        expireDateField.clear();
        expireDateField.sendKeys(expiryDate);
    }

    public void enterPaymentInformation(String paymentMethod, String cardNumber, String expireDate_) {
        selectPaymentMethod(paymentMethod);
        enterCardNumber(cardNumber);
        enterExpireDate(expireDate_);
    }

    public void process() {

        processButton.click();
    }
}

