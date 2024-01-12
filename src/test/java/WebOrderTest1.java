import org.junit.jupiter.api.Test;
import pages.HomePage;

public class WebOrderTest1 extends Hooks {

	@Test
	void testSeleniumWebDriver() throws InterruptedException {
		HomePage homePage = new HomePage();
		homePage.clickOnWeborderLink();

	}

}
