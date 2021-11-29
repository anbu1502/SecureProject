package com.page;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.setdef.StepDefinition;

public class AddToCard extends BaseClass {
	
	public AddToCard() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy (xpath="//button[text()='GO TO CART']"),@FindBy (xpath="//button[text()='ADD TO CART']")})
	private WebElement clkAdd;

	public WebElement getClkAdd() {
		return clkAdd;
	}
	
	public void addTo() {
		Set<String> windows = driver.getWindowHandles();

		List<String> li = new ArrayList<String>(windows);
		for(int i =0 ;i<windows.size() ; i++) {
			String string = li.get(1);
			
			driver.switchTo().window(string);
		}	
		getClkAdd().click();
	}
	
}
