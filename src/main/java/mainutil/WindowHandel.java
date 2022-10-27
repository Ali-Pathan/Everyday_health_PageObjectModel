package mainutil;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import baseclass.TestBase;

public class WindowHandel extends TestBase {
	public static void win() {
		String parentWindowId = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		List<String> hList = new ArrayList<String>(handles);
		if (switchToTightWindow("pinterest", hList)) {
			System.out.println(driver.getCurrentUrl() + ":" + driver.getTitle());
		}
		closeAllWindows(hList, parentWindowId);
		switchToParentWindow(parentWindowId);
		System.out.println(driver.getCurrentUrl() + ":" + driver.getTitle());

	}

	public static void closeAllWindows(List<String> hList, String parentWindowId) {
		for (String e : hList) {
			if (!e.equals(parentWindowId)) {
				driver.switchTo().window(e).close();
			}
		}
	}

	public static void switchToParentWindow(String parentWindowId) {
		driver.switchTo().window(parentWindowId);

	}

	public static boolean switchToTightWindow(String windowTitle, List<String> hList) {
		for (String e : hList) {
			String title = driver.switchTo().window(e).getTitle();
			if (title.contains(windowTitle)) {
				System.out.println("Found the right window...");
				return true;
			}
		}
		return false;
	}
}
