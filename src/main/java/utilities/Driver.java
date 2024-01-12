package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	private static final ThreadLocal<WebDriver> DRIVER_THREAD_LOCAL = new ThreadLocal<>();

	private Driver() {
		throw new UnsupportedOperationException("Can not instantiate utility class");
	}

	public static void setDriver(String browserType) {
		if (DRIVER_THREAD_LOCAL.get() == null) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com");
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				throw new RuntimeException(e);
			}

			DRIVER_THREAD_LOCAL.set(driver);
		}

	}

	public static WebDriver getDriver() {

		setDriver(System.getProperty("browser", "chrome"));

		return DRIVER_THREAD_LOCAL.get();

	}

	public static void closeDriver() {
		WebDriver currentDriver = DRIVER_THREAD_LOCAL.get();
		if (currentDriver != null) {
			currentDriver.quit();
			DRIVER_THREAD_LOCAL.remove();
		}
	}

}