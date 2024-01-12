import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.WebOrderLoginPage;

public class WebOrderTest2 extends Hooks {
    @Test
    void testSeleniumWebDriver() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.clickOnWeborderLink();
        WebOrderLoginPage weborderLoginPage = new WebOrderLoginPage();
        weborderLoginPage.login("Inar", "Academy");
    }
}
