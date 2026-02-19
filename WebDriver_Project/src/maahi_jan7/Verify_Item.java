package maahi_jan7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Item {

	public static void main(String[] args) throws Throwable {
		String Item_Present = "india";
		Boolean Item_Exist = false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://practice.expandtesting.com/dropdown");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("country")));
		List<WebElement> all_Options = dropdown.getOptions();
	System.out.println("No of items     "+all_Options.size());
	for (WebElement each : all_Options) {
		String Actual_Items = each.getText();
		Thread.sleep(5000);
		System.out.println(Actual_Items);
		if (Actual_Items.equalsIgnoreCase(Item_Present)) {
			Item_Exist=true;
			break;
		}
	}
	if (Item_Exist) { //true/false
		System.out.println("Item Found in Listbox    "+Item_Present+"    "+"Test pass");
	}
	else
	{
		System.out.println("Item not Found in Listbox    "+Item_Present+"    "+"Test fail");
		}
			Thread.sleep(5000);
			driver.quit();
		}
		}


