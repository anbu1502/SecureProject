package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class OrderPlace extends BaseClass {
	
	public OrderPlace() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='_3LxTgx']//child::div[@class='_2Tpdn3']")
	private WebElement payAble;

	public WebElement getPayAble() {
		return payAble;
	}
	
	public void tPrice() {
		System.out.println("Total Price : "+getPayAble().getText());
		
	}
	public void navigate() {
		driver.navigate().back();
		
		
	}

}
