package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AcInvertor extends BaseClass{

	public AcInvertor() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='TVs & Appliances']")
	private WebElement tvApp;
	
	@FindBy(xpath="//a[text()='Inverter AC']")
	private WebElement inverterAC;
	
	@FindBy(xpath="//div[contains(text(),'ONIDA 1 Ton 3 St')]")
	private WebElement acClk;

	public WebElement getTvApp() {
		return tvApp;
	}

	public WebElement getInverterAC() {
		return inverterAC;
	}

	public WebElement getAcClk() {
		return acClk;
	}
	
	public void selectAc() {
		Actions a = new Actions(driver);
		a.moveToElement(getTvApp()).perform();
		a.moveToElement(getInverterAC()).click().perform();
		getAcClk().click();
	}
	public void verifyTVOption() {
		Actions a = new Actions(driver);
		a.moveToElement(getTvApp()).perform();
		a.moveToElement(getInverterAC()).click().perform();
	}
	
	
}
