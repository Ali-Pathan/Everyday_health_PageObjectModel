package everydayhealth;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;
import mainutil.Utility;
import mainutil.WindowHandel;

public class HomePage extends TestBase {

	@FindBy(xpath = "//*[@class='header__button header__button--menu-toggle']")
	WebElement menu;
	@FindBy(xpath = "//*[@class='theme-content__title-box theme-content__title-box--left']//*[text()='Wellness']")
	WebElement Wellness;

	@FindBy(xpath = "//*[text()='Log in']")
	WebElement login;

	@FindBy(id = "LoginModel_Email")
	WebElement email;
	@FindBy(id = "LoginModel_Password")
	WebElement pwd;

	@FindBy(xpath = "//*[@class='footer__share']//*[@class='social__share__btn social__share__btn--facebook']")
	WebElement facebook;
	@FindBy(xpath = "//*[@class='footer__share']//*[@class='social__share__btn social__share__btn--twitter']")
	WebElement twitter;
	@FindBy(xpath = "//*[@class='footer__share']//*[@class='social__share__btn social__share__btn--instagram']")
	WebElement instagram;
	@FindBy(xpath = "//*[@class='footer__share']//*[@class='social__share__btn social__share__btn--pinterest']")
	WebElement pinterest;
	@FindBy(xpath = "//*[@class='footer__share']//*[@class='social__share__btn social__share__btn--youtube']")
	WebElement youtube;
	@FindBy(xpath = "//*[@class='footer__share']//*[@class='social__share__btn social__share__btn--tiktok']")
	WebElement tiktok;

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	/*
	 * public void ScrollDown() throws Exception { Utility.Scroll(Wellness);
	 * Utility.Highlight(driver, Wellness); Utility.Screenshot("ScreenShot:");
	 * 
	 * }
	 */

	public void EnterEmail() {
		Utility.Highlight(driver, menu);
		menu.click();
		login.click();
		Utility.Highlight(driver, email);
		email.sendKeys("rajive@hotmail.com");
		Utility.Highlight(driver, pwd);
		pwd.sendKeys("1234568");
	}

	public void windowhandel() {

		facebook.click();
		twitter.click();
		instagram.click();
		pinterest.click();
		youtube.click();
		tiktok.click();
		WindowHandel.win();

	}
}
