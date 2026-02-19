package maahi_jan9;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandles2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Terms")).click();
		Set<String>brw =driver.getWindowHandles();
		Object window[]=brw.toArray();
		String parent = window[0].toString();
		String child = window[1].toString();
		Thread.sleep(5000);
		driver.switchTo().window(child);
		String visibleText = driver.findElement(By.xpath("//h2[@dir='auto']//span[contains(text(),'Terms of Service')]")).getText();
		System.out.println(visibleText);
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		Select yearlistbox = new Select(driver.findElement(By.id("year")));
		List<WebElement> all_options = yearlistbox.getOptions();
		System.out.println(all_options.size());
		for (WebElement each : all_options) {
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
		driver.quit();
		
			
		}
		

	}


