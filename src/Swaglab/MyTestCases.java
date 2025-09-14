package Swaglab;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {
	
	WebDriver driver =new EdgeDriver();
	String MyWebsite ="https://www.saucedemo.com/";
	
	
	@BeforeTest
	
	public void mysetup() {
		driver.get (MyWebsite);
	}
		
		@Test
		
		public void login() {
			String username ="standard_user";
			String password ="secret_sauce";
			//String firstname="sara";
			String lastname="saleh";
			String zipcode="Amman";
			driver.findElement(By.id("user-name")).sendKeys(username);
			
			
			driver.findElement(By.id("password")).sendKeys(password);
			
			driver.findElement(By.id("login-button")).click();
			
			driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
			
			driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
			
			driver.findElement(By.id("shopping_cart_container")).click();
			
			driver.findElement(By.id("checkout")).click();
			
			driver.findElement(By.id("first-name")).sendKeys("sara");
			
			driver.findElement(By.id("last-name")).sendKeys(lastname);
			
			driver.findElement(By.id("postal-code")).sendKeys(zipcode);

			
			driver.findElement(By.id("continue")).click();
			
			driver.findElement(By.id("finish")).click();



		}
		



}
		
	


