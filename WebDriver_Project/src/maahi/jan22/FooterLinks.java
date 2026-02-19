package maahi.jan22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		//get footer links collection
		List<WebElement> footer_Links = driver.findElements(By.cssSelector("#pageFooterChildren ul li a"));
		//Print Number of Footer Links
		System.out.println("No of footer links are::"+footer_Links.size());
		//Loop Through Each Link
		for (WebElement each : footer_Links) {
			System.out.println(each.getText()); //Print Link Text
			System.out.println(each.getAttribute("href")); //Print Link URL
		}
		driver.quit();
		}

	}


