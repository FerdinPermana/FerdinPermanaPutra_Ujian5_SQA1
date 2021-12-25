package com.juaracoding.locator.checkout;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.locator.driver.DriverSingleton;

public class Checkout {
private WebDriver driver;
	
	public Checkout() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")
	private WebElement btncheckout;
	
	@FindBy(css ="#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span")
	private WebElement btnsummary;
	
	@FindBy(css ="#center_column > form > div > p > a > span")
	private WebElement btnnewaddress;
	
	@FindBy(css ="#center_column > form > p > button > span")
	private WebElement btncheckout1;
	
	@FindBy(css ="#cgv")
	private WebElement btnshipping;
	
	@FindBy(css ="#form > p > button > span")
	private WebElement btncheckout2;
	
	@FindBy(css ="#HOOK_PAYMENT > div:nth-child(1) > div")
	private WebElement btnpaybybank;
	
	@FindBy(css ="#HOOK_PAYMENT > div:nth-child(2) > div")
	private WebElement btnpaybycheck;
	
	@FindBy(css ="#cart_navigation > button")
	private WebElement btnpaymen;
	
	
	public void checkout() {
		btncheckout.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		btnsummary.click();
		JavascriptExecutor ks = (JavascriptExecutor) driver;
		ks.executeScript("window.scrollBy(0,1000)");
		btnnewaddress.click();
		btncheckout1.click();
		JavascriptExecutor ls = (JavascriptExecutor) driver;
		ls.executeScript("window.scrollBy(0,1000)");
		btnshipping.click();
		btncheckout2.click();
		JavascriptExecutor os = (JavascriptExecutor) driver;
		os.executeScript("window.scrollBy(0,1000)");
		btnpaybybank.click();
		btnpaybycheck.click();
		btnpaymen.click();
	}

}
