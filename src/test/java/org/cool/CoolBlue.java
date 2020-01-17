package org.cool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoolBlue {
	WebDriver driver = launchBrowser();
	
	driver.manage().window().maximize();
	
	String URL = "https://www.giftloft.co.nz/";
	
	navigateTo(driver, URL);
			
	//Thread.sleep(5000);
	
	login(driver);	
	
	searchProduct(driver);
	
	addToCart(driver);
	
	checkout(driver);
	
	getItemDetails(driver);
	

	}

}
