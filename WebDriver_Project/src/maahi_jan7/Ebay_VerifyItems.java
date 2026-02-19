package maahi_jan7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebay_VerifyItems {

	public static void main(String[] args) throws Throwable {
	String Category_Present ="Crafts";
	boolean Category_Exist = false;
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.ebay.com/");
	Thread.sleep(5000);
	Select dropdown = new Select(driver.findElement(By.name("_sacat")));
	List<WebElement>all_options = dropdown.getOptions();
	System.out.println("No of categories  "+all_options.size());
	for (WebElement each : all_options) {
		String Actual_Category = each.getText();
		Thread.sleep(500);
		System.out.println(Actual_Category);
		if (Actual_Category.equalsIgnoreCase(Category_Present)) {
			Category_Exist = true;
			break;
		}
	}
	if (Category_Exist) {//truec/false
		System.out.println("Category Found in listbox   "+Category_Present+"  "+"TestPass");
	}
	else {
		System.out.println("Category Found in listbox   "+Category_Present+"  "+"TestPass");
	}
		Thread.sleep(500);
		driver.quit();
	}
	
			
		}
		

