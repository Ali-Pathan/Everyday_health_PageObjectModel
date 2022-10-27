package mainutil;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseclass.TestBase;

public class Utility extends TestBase {

	public static void Highlight(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid red;');", element);

	}

	public static void Scroll(WebElement element) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		Thread.sleep(5000);
	}

	public static void Screenshot(String filename) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,
				new File("D:\\Selenium\\Eclipse Workplace\\EverydayHealth\\ScreenShots\\" + filename + ".jpg"));

	}

	public static boolean switchToRightWindow(String WindowTitle, List<String> Hlist) {
		for (String e : Hlist) {

			String title = driver.switchTo().window(e).getTitle();
			if (title.contains(WindowTitle)) {
				System.out.println("Right Window");
				return true;

			}
		}
		return false;

	}
}
