package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Remove extends BaseClass {

	public Remove() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='Remove']")
	private WebElement clkRemove;

	@FindBy(xpath = "//div[text()='Cancel']//following-sibling::div")
	private WebElement confirmRemove;

	@FindBy(xpath = "//div[contains(text(),'Your')]")
	private WebElement removed;

	public WebElement getClkRemove() {
		return clkRemove;
	}

	public WebElement getConfirmRemove() {
		return confirmRemove;
	}

	public WebElement getRemoved() {
		return removed;
	}

	public void removeOrder() {
		getClkRemove().click();
		getConfirmRemove().click();
		System.out.println(getRemoved().getText());

	}

}
