package maahi_jan3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Validation_Methods {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://webapp.qedgetech.com/");
		Thread.sleep(5000);
		//capture text in webpage
		String elemetText = driver.findElement(By.partialLinkText("Forgot Passwo")).getText();
System.out.println(elemetText);
	//capture element url
		String elementUrl = driver.findElement(By.partialLinkText("Forgot Passwo")).getAttribute("href");
		System.out.println(elementUrl);
		driver.quit();
		

	}

}
