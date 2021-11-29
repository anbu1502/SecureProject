package com.setdef;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.BaseClass;
import com.page.AcInvertor;
import com.page.AddToCard;
import com.page.OrderPlace;
import com.page.MyCart;
import com.page.Remove;
import com.page.loginPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass {

	@Given("user should in login page")
	public void user_should_in_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("user should login {string} and {string} then verify is {string}")
	public void user_should_login_and_then_verify_is(String name, String pass, String profile) {
		loginPages login = new loginPages();
		login.login(name, pass, profile);
		login.menu();
	}

	@When("user should search electronics and select inverter AC")
	public void user_should_search_electronics_and_select_inverter_AC() {
		AcInvertor ac = new AcInvertor();
		ac.selectAc();
	}

	@When("user should add product to cart")
	public void user_should_add_product_to_cart() {
		AddToCard add = new AddToCard();
		add.addTo();
	}

	@When("user should add one more quatity then print discount and price")
	public void user_should_add_one_more_quatity_then_print_discount_and_price() {
		MyCart c = new MyCart();
		c.addQuality();
		c.price();
		c.clkOrder();
	}

	@When("user should print total price")
	public void user_should_print_total_price() {
		OrderPlace d = new OrderPlace();
		d.tPrice();
		d.navigate();
	}

	@Then("user should navigate to myCart page and the remove products then verify")
	public void user_should_navigate_to_myCart_page_and_the_remove_products_then_verify() {
		Remove remove = new Remove();
		remove.removeOrder();
		driver.quit();
	}

	@When("user should verify with invaild userName {string} and {string}")
	public void user_should_verify_with_invaild_userName_and(String name, String pass) {
		loginPages login = new loginPages();
		login.loginOnly(name, pass);
	}

	@Then("verify {string} message is displayed")
	public void verify_message_is_displayed(String verify) {
		loginPages login = new loginPages();
		login.verifyLogin(verify);
		driver.quit();
	}

	@When("user should verify with invaild password{string} and {string}")
	public void user_should_verify_with_invaild_password_and(String name, String pass) {
		loginPages login = new loginPages();
		login.loginOnly(name, pass);
	}

	@Then("User should verify not to login{string}")
	public void user_should_verify_not_to_login(String verify) {
		loginPages login = new loginPages();
		login.verifyInvalid(verify);

	}

}
