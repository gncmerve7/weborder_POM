import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import pages.HomePage;
import pages.OrderPage;
import pages.WebOrderHomePage;
import pages.WebOrderLoginPage;
import utilities.BrowserUtils;

public class WebOrderTest4 extends Hooks {

	@Test
	void testSeleniumWebDriver() throws InterruptedException {
		HomePage homePage = new HomePage();
		homePage.clickOnWeborderLink();
		WebOrderLoginPage weborderLoginPage = new WebOrderLoginPage();
		weborderLoginPage.login("Inar", "Academy");
		WebOrderHomePage webOrderHomePage = new WebOrderHomePage();
		webOrderHomePage.navigateToOrder();
		OrderPage orderPage = new OrderPage();
		BrowserUtils.scrollVertically(1000);
		orderPage.enterProduct("Books", "10", "10");
		BrowserUtils.scrollVertically(1000);

		orderPage.enterCustomerInfo("Francois", "Main", "NewYork", "NW", "1004");
		orderPage.enterPaymentInformation("visa", "4938281746192845", "11/32");
		BrowserUtils.scrollDown();
		Thread.sleep(1000);
		orderPage.process();
	}

}
