package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mytest {
WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest
	public void Mysetup  () {
		
		driver.get("https://www.saucedemo.com/");
		
		
		}
	
	@Test
	public void MyFirstTest () {
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
	}
	
}
