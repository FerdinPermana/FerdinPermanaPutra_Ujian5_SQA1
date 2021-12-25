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
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img")
	private WebElement btnView1;
	
	@FindBy(xpath="/html/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul/li[2]/div[1]/div[2]/div[2]/a[2]")
	private WebElement btnMore1;
	
	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button")
	private WebElement btnAddtoCart1;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")
	private WebElement btnContinue;

	@FindBy(css ="#block_top_menu > ul > li:nth-child(3)")
	private WebElement btntshirt;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div")
	private WebElement btnView2;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]")
	private WebElement btnMore2;
	
	@FindBy(css="#add_to_cart > button")
	private WebElement btnAddtoCart2;
	
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
	private WebElement btnCheckout;
	
	
	public void dress() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		btndress.click();
		js.executeScript("window.scrollBy(0,1000)");
		Actions action = new Actions(driver);
		action.moveToElement(btnView1).moveToElement(btnMore1).click().perform();
		js.executeScript("window.scrollBy(0,300)");
		btnAddtoCart1.click();
		btnContinue.click();
	}
	
	public void tshirt() {
		btntshirt.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		Actions action = new Actions(driver);
		action.moveToElement(btnView2).moveToElement(btnMore2).click().perform();
		js.executeScript("window.scrollBy(0,300)");
		btnAddtoCart2.click();
		btnCheckout.click();
	}
}
