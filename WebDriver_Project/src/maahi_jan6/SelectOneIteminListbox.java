package maahi_jan6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class SelectOneIteminListbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.amazon.in/");//you want to use any website
		Thread.sleep(5000);
		//select one item in listbox
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
        listbox.selectByVisibleText("Baby") ;
		System.out.println(listbox.getFirstSelectedOption().getText());
		//how many items in list box
        List<WebElement> listbox1 = driver.findElements(By.tagName("select"));
        System.out.println(listbox1.size());
        driver.quit();
	}
	

}
 