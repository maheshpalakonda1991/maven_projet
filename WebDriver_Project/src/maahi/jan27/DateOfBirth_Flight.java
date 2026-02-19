package maahi.jan27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateOfBirth_Flight {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://flights.qedgetech.com/");
		Thread.sleep(5000);
//login into flights page
		driver.findElement(By.name("email")).sendKeys("shravankumar121999@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Flight@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		//
		driver.quit();
		
	} 

}
