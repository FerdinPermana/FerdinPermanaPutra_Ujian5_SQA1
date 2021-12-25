package com.juaracoding.locator.pages.dashbord;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.locator.driver.DriverSingleton;

public class Dashboard {
private WebDriver driver;
	
	public Dashboard() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="#block_top_menu > ul > li:nth-child(2)")
	private WebElement btndress;
	
	@FindBy(css ="#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")
	private WebElement btndressaddcart;

	@FindBy(css ="#block_top_menu > ul > li:nth-child(3)")
	private WebElement btntshirt;
	
	@FindBy(css ="#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")
	private WebElement btntshirtcart;
	
	
	public void dress() {
		btndress.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		btndressaddcart.click();
	}
	
	public void tshirt() {
		btntshirt.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		btntshirtcart.click();
	}
}
