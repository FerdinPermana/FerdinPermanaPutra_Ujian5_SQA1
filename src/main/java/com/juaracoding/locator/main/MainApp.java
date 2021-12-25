package com.juaracoding.locator.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.locator.checkout.Checkout;
import com.juaracoding.locator.driver.DriverSingleton;
import com.juaracoding.locator.pages.dashbord.Dashboard;
import com.juaracoding.locator.pages.login.LoginPage;

public class MainApp {

	public static void main(String[] args) {
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("http://automationpractice.com/");
		
		
		LoginPage login = new LoginPage();
		login.gotoLogin();
		login.login("ferdinpermana.p@gmail.com", "admin12345");
		
		Dashboard dashboard = new Dashboard();
		dashboard.dress();
		dashboard.tshirt();
		
		Checkout checkout = new Checkout();
		checkout.checkout();

		
	}

}
