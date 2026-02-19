package maahi_jan2;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {

	public static void main(String[] args) throws Throwable {
		// create instance object
		WebDriver driver = new ChromeDriver();//you want use in firefox browser also 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	driver.get("http://orangehrm.qedgetech.com/");
	Thread.sleep(5000);
	//fill username and password and click login button
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
	driver.findElement(By.name("Submit")).click();
	driver.quit();
	}
}
