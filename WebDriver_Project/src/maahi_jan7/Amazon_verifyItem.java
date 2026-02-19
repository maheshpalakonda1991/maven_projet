package maahi_jan7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_verifyItem {

	public static void main(String[] args) throws Throwable {
 	String Category_present = "Beauty";
			boolean Category_Exit = false;
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.amazon.in/");
	Thread.sleep(5000);
	Select dropdown = new Select(driver.findElement(By.name("url")));
	List<WebElement>all_options = dropdown.getOptions();
	System.out.println("No of items   "+all_options.size());
	for (WebElement each : all_options) {
		String Actual_Category = each.getText();
		Thread.sleep(500);
		System.out.println(Actual_Category);
		if (Actual_Category.equalsIgnoreCase(Category_present)) {
			Category_Exit = true;
			break;
		}
	}
	if (Category_Exit) {
		System.out.println("Category Found in Listbox   "+Category_present+"  "+"TestPass");
	}
	else {
		System.out.println("Category not Found in Listbox   "+Category_present+"  "+"TestFail");
	}
	Thread.sleep(500);
	driver.quit();
	}
		}
		
	
