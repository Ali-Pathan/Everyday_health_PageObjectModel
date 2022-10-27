package baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;

	public static void initialization() {

//		System.setProperty("webdriver.chrome.driver",
//				new File(System.getProperty("user.home"), "chromedriver.exe").getAbsolutePath());
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Eclipse Workplace\\EverydayHealth\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.everydayhealth.com/");

	}
}
