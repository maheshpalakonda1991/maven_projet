package maahi_jan2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Using_Webelement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
   driver.get("http://orangehrm.qedgetech.com/");
   Thread.sleep(7000);
   WebElement username = driver.findElement(By.id("txtUsername"));
   username.clear();
   username.sendKeys("Admin");
   WebElement password = driver.findElement(By.id("txtPassword"));
   password.clear();
   password.sendKeys("Qedge123!@#");
   WebElement loginbtn = driver.findElement(By.id("btnLogin"));
   loginbtn.submit();
   //loginbtn.submit(); also used for submit button
   	driver.quit();	
   

	}

}
