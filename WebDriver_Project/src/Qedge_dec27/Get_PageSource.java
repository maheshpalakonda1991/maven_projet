package Qedge_dec27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_PageSource {

	public static void main(String[] args) throws Throwable {
		// create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url 
		driver.get("http://facebook.com");// you want search any thing
		Thread.sleep(5000);
		//get source code 
		String str_Sorce = driver.getPageSource();
		System.out.println(str_Sorce);
		driver.quit();




	}

}
