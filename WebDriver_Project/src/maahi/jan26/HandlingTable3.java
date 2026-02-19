package maahi.jan26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/tools/forex");
		Thread.sleep(5000);
		//store table into webelement
		WebElement webTable = driver.findElement(By.className("dataTable "));
		//get collection of rows form webtable
		List<WebElement> rows = webTable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("No of rows are    "+row);
		List<WebElement> cells = rows.get(16).findElements(By.tagName("td"));
		String cname = cells.get(0).getText();
	    String crate = cells.get(1).getText();
	    System.out.println(cname+"   "+crate);
	    driver.quit();
	    }
	   

}
