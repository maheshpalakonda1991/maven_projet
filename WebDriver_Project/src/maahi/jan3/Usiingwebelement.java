package maahi.jan3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Usiingwebelement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://webapp.qedgetech.com/");
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath("//span[normalize-space()='Username']"));
		username.clear();
		username.sendKeys("Admin");
		//capture user name value
		String uservalue = username.getAttribute("value");//value is property name
		WebElement password = driver.findElement(By.xpath("//span[normalize-space()='Password']"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		String passvalue = password.getAttribute("value");//value is propertyname
		System.out.println(passvalue);
		WebElement loginbtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		loginbtn.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();
		if(Actual.contains(Expected))
		{
		System.out.println("Login Sucess    "+Expected+"      "+Actual+"    "+"Test pass");
		}
		else
		{
		String error_Message = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();	
		System.out.println(error_Message+"    "+Expected+"       "+Actual+"    "+"Test fail");
		}
		driver.quit();
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		

