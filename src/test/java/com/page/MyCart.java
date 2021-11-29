package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.setdef.StepDefinition;

public class MyCart extends BaseClass {
	public MyCart() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='+']")
	private WebElement addQuality;

	@FindBy(xpath = "//div[@class='_1YVZr_']")
	private WebElement discount;

	@FindBy(xpath = "//span//div//div")
	private WebElement price;

	@FindBy(xpath = "//button[contains(@class,'_2KpZ6')]")
	private WebElement placeOrder;

	public WebElement getAddQuality() {
		return addQuality;
	}

	public WebElement getDiscount() {
		return discount;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getPlaceOrder() {
		return placeOrder;
	}

	public void addQuality() {
		getAddQuality().click();
	}

	public void price() {
		System.out.println("Discount Price : " + getDiscount().getText());
		System.out.println("Price : " + getPrice().getText());
	}

	public void clkOrder() {
		getPlaceOrder().click();
	}

}
