import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import utilities.Driver;

import javax.annotation.ParametersAreNonnullByDefault;

public class Hooks {

	@BeforeAll
	public static void setUpTestEnvironment() {
		Driver.getDriver();
	}

	@AfterAll
	public static void tearDownTestEnvironment() {
		Driver.closeDriver();
	}

}