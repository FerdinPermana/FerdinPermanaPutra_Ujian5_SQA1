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
	
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]") 
	private WebElement btnCheckoutSum;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	private WebElement btnCheckoutAddress;
	
	@FindBy(xpath = "//*[@id=\"uniform-cgv\"]")
	private WebElement btnBoxShip;
	
	@FindBy(xpath = "//*[@id=\"form\"]/p/button")
	private WebElement btnCheckoutShip;
	
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	private WebElement btnPayBankWire;
	
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	private WebElement btnConfirmPay;
	
	
	public void checkout() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		btnCheckoutSum.click();
		js.executeScript("window.scrollBy(0,800)");
		btnCheckoutAddress.click();
		js.executeScript("window.scrollBy(0,500)");
		btnBoxShip.click();
		btnCheckoutShip.click();
		js.executeScript("window.scrollBy(0,800)");
		btnPayBankWire.click();
		js.executeScript("window.scrollBy(0,800)");
		btnConfirmPay.click();
	}

}
