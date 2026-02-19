
package maahi_jan9;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTC_Window_Handles3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		//OK button
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
		//click FLIGHTS opens new window
		driver.findElement(By.linkText("FLIGHTS")).click();
		//window handles
		Set<String>brw = driver.getWindowHandles();
		Object window[] = brw.toArray();
		String parent = window[0].toString();
		String child  = window[1].toString();
		Thread.sleep(3000);
		//switch to flight window
		driver.switchTo().window(child);
		Thread.sleep(5000);
		System.out.println("Flights window opened");
		// Close Flights window
		driver.close();
		// Switch back to Parent window
		driver.switchTo().window(parent);
		Thread.sleep(1000);
		System.out.println("Back to IRCTC parent window");
		// GENERAL dropdown (Journey Class)
		Select generalListBox = new Select(driver.findElement(By.xpath("//select[@formcontrolname='journeyClass']")));
		List<WebElement> allOptions = generalListBox.getOptions();
		System.out.println("Total options: " + allOptions.size());
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}
		driver.quit();
	}
}