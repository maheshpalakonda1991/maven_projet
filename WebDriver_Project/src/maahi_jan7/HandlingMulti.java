package maahi_jan7;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMulti {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("file:///D:/MultiListboxHtmlpage_lyst1767770603945.html");
	Thread.sleep(5000);
	Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
	//verify dropdown is single or multi selection
	boolean value = dropdown.isMultiple();
System.out.println(value);
//select 0 to 8 item in dropdown
for(int i=0;i<=8;i++)
{
	Thread.sleep(2000);
	dropdown.selectByIndex(i);
	}
	//deselect form selection
dropdown.deselectByVisibleText("White");
Thread.sleep(5000);
dropdown.selectByIndex(5);
Thread.sleep(5000);
dropdown.deselectAll();
Thread.sleep(5000);
driver.quit();

	}

}
