package maahi.jan24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Method {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		//verify gmail link displayed or not
		boolean value = driver.findElement(By.linkText("Gmail")).isDisplayed();
		//verify demo link in google page is displayed or not
	    try {
			if (driver.findElement(By.linkText("Demo")).isDisplayed());
			{
				System.out.println("Demo link Displayed in Google page   "+"Test Pass");
				}
		} catch (Exception e) {
			{
			System.out.println("Demo link not Displayed in Google page   "+"Test Fail");
		}

	}
driver.quit();

	}
}
