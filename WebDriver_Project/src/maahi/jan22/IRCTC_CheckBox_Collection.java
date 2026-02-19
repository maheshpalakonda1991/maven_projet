package maahi.jan22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC_CheckBox_Collection {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		//ok button
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	Thread.sleep(2000);

List<WebElement> all_checkbox = driver.findElements(By.xpath("//label[@class=\"css-label_c t_c\"]"));
System.out.println(all_checkbox.size());
for (WebElement each : all_checkbox) {
	System.out.println(each.getText());
	}
driver.quit();
	}

}
