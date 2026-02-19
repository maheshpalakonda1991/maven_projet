package maahi_jan7;

import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://practice.expandtesting.com/dropdown");
        Thread.sleep(5000);
        //store listbox into select class
        Select listbox = new Select(driver.findElement(By.name("country")));
        //get collection all options inside listbox
        List<WebElement> all_options = listbox.getOptions();
        System.out.println("No of items  "+all_options.size());
        for (WebElement each : all_options) {
        	System.out.println(each.getText());
        }
		driver.quit();
        

	}

}
