package maahi.jan8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task_Rediff_HandlingAlert4 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		//click of login
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/form/button")).click();
		//Capture alert message
		String Alert_message = driver.switchTo().alert().getText();
		System.out.println(Alert_message);
		Thread.sleep(3000);
		driver.quit();
		

	}

}
