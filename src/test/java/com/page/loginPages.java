package com.page;

import org.openqa.selenium.WebDriver;

import java.awt.Menu;

import javax.swing.MenuSelectionManager;

import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

public class loginPages extends BaseClass {

	public loginPages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginBtn;

	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement userName;

	@FindBy(xpath = "//input[contains(@class,'_2IX_2- _3m')]")
	private WebElement pass;

	@FindBy(xpath = "//div[text()='Anbu']")
	private WebElement verify;

	@FindBy(xpath = "//button[contains(@class,'_2KpZ6l _2HKlqd _3AW')]")
	private WebElement clkLogin;

	@FindBy(xpath = "//div[text()='Electronics']")
	private WebElement clkElectronics;

	@FindBy(xpath = "//a[text()='All']")
	private WebElement all;

	@FindBy(xpath = "//span[contains(text(),'Please enter valid')]")
	private WebElement verifyMag;

	@FindBy(xpath = "//span[contains(text(),'Your username')]")
	private WebElement verifyinvalid;

	public WebElement getVerifyinvalid() {
		return verifyinvalid;
	}

	public WebElement getVerifyMag() {
		return verifyMag;
	}

	public WebElement getAll() {
		return all;
	}

	public WebElement getClkElectronics() {
		return clkElectronics;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getVerify() {
		return verify;
	}

	public WebElement getClkLogin() {
		return clkLogin;
	}

	public void login(String name, String pass, String profile) {
		getUserName().sendKeys(name);
		getPass().sendKeys(pass);
		getClkLogin().click();
		String text = getVerify().getText();
		Assert.assertEquals(text, profile);
		System.out.println("User logged in successfully");
	}

	public void loginOnly(String name, String pass) {
		getUserName().sendKeys(name);
		getPass().sendKeys(pass);
		getClkLogin().click();
	}

	public void verifyInvalid(String verify) {
		String text = getVerifyinvalid().getText();
		Assert.assertEquals(verify, text);
		System.out.println(text);
		System.out.println("verified that invalid is not logged in");

	}

	public void verifyLogin(String verify) {

		String text = getVerifyMag().getText();
		Assert.assertEquals(verify, text);
		System.out.println(text);
		System.out.println("verified that invalid is not logged in");
	}

	public void menu() {
		Actions a = new Actions(driver);
		a.moveToElement(getClkElectronics()).perform();
		a.moveToElement(getAll()).click().perform();

	}

	public void verifyTVs() {

	}

}
