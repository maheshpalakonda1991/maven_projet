package maahi_jan7;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox1 {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("file:///D:/MultiListboxHtmlpage_lyst1767770603945.html");
	Thread.sleep(5000);
	Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
	//get collection of all items
	List<WebElement>all_options = dropdown.getOptions();
	System.out.println("NO of items  "+all_options.size());
	//select some items
	for(int i=0;i<=10;i++)
{ 
		Thread.sleep(200);
		dropdown.selectByIndex(i);
}
	//get collection of items which are selected above
	List<WebElement>all_selected= dropdown.getAllSelectedOptions();
	System.out.println("No of items selected  "+all_selected.size());
	//print each option name which are selected above
	for (WebElement each : all_selected) {
		System.out.println(each.getText());
		}
	Thread.sleep(5000);
	driver.quit();
}
  
	}


