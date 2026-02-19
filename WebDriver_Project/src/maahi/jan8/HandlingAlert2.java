package maahi.jan8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlert2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(5000);
		//click for js script
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		//capture alert text
		String Alert_Message = driver.switchTo().alert().getText();
		System.out.println(Alert_Message);
		Thread.sleep(5000);
		//click cancel
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		
        //capture web Text
		String webText = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(webText);
		Thread.sleep(5000);
		driver.quit();
		}
}
