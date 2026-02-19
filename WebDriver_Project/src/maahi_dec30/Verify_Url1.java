package maahi_dec30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Url1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gmial.com");
		Thread.sleep(5000);
		String Expected = "https://";
		String Actual = driver.getCurrentUrl();
		if(Actual.startsWith(Expected))
		{
			System.out.println("url is secured   "+Expected+"   "+Actual+"  "+"Test pass");
		}
		else
		{
			System.out.println("url is secured   "+Expected+"   "+Actual+"  "+"Test fail");
			}
		driver.quit();
			
			

	}

}
