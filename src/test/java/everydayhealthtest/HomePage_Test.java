package everydayhealthtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.TestBase;
import everydayhealth.HomePage;

public class HomePage_Test extends TestBase {
	HomePage homepage;

	@BeforeMethod

	public void setup() {
		initialization();
		homepage = new HomePage();

	}

	/*
	 * @Test(priority = 1) public void ScrollDownTest() throws Exception {
	 * homepage.ScrollDown();
	 * 
	 * }
	 */

	@Test(priority = 1)
	public void EnterEmailTest() {
		homepage.EnterEmail();

	}

	@Test(priority = 2)
	public void OpenWindows() {
		homepage.windowhandel();

	}

	@AfterMethod

	public void teardown() {
		driver.quit();

	}

}
