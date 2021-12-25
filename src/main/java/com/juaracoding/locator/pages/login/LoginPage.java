package com.juaracoding.locator.pages.login;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.locator.driver.DriverSingleton;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "email")
	private WebElement txtUsername;
	
	@FindBy(name = "passwd")
	private WebElement txtPassword;
	
	
	@FindBy(css = "#SubmitLogin")
	private WebElement btnLogin;
	
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement goLoginButton;
	
	public void login(String email, String password) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,50)");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
		txtUsername.sendKeys(email);
		txtPassword.sendKeys(password);
		btnLogin.click();
		
		
	}

	public void gotoLogin() {
		goLoginButton.click();
		
	}

}
