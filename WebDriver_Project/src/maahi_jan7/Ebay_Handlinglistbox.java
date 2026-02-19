package maahi_jan7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebay_Handlinglistbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		Thread.sleep(5000);
		//store allcategory listbox into select class
		Select allcategory = new Select(driver.findElement(By.name("_sacat")));
		//get collection all optins inside allcategory listbox
		List<WebElement> all_option = allcategory.getOptions();
		System.out.println("No of items  "+all_option.size());
		for (WebElement each : all_option) {
			System.out.println(each.getText());
			}
		driver.quit();
	}

}
