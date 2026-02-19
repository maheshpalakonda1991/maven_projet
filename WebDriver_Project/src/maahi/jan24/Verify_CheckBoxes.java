package maahi.jan24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_CheckBoxes {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/checkboxradio/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		//get collection of checkboxes
		List<WebElement> all_checkbox = driver.findElements(By.xpath("//label[@class='ui-checkboxradio-label ui-corner-all ui-button ui-widget']"));
       System.out.println("No of checkboxes are    "+all_checkbox.size() );
       for (WebElement each : all_checkbox) {
    	   boolean value = each.isSelected();
    	   String checkboxname = each.getText();
    	   System.out.println(checkboxname+"    "+value);
    	   Thread.sleep(1000);
    	   each.click();
    	   }
			Thread.sleep(5000);
			driver.quit();

	}

}
