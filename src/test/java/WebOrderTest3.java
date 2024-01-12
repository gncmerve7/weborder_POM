import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.WebOrderHomePage;
import pages.WebOrderLoginPage;

public class WebOrderTest3 extends Hooks {

	@Test
	void testSeleniumWebDriver() throws InterruptedException {
		HomePage homePage = new HomePage();
		homePage.clickOnWeborderLink();
		WebOrderLoginPage weborderLoginPage = new WebOrderLoginPage();
		weborderLoginPage.login("Inar", "Academy");
		WebOrderHomePage webOrderHomePage = new WebOrderHomePage();
		webOrderHomePage.navigateToOrder();

	}

}
