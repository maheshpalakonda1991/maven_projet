package maahi_jan5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Methods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.com/");
System.out.println("page title[1]"+driver.getTitle());
Thread.sleep(5000);
//click Gmail link to open page
driver.findElement(By.linkText("Gmail")).click();
System.out.println("page title[2]"+driver.getTitle());
Thread.sleep(5000);
//click back button
driver.navigate().back();
System.out.println("page title[3]"+driver.getTitle());
Thread.sleep(5000);
//click forward button
driver.navigate().forward();
System.out.println("page title[4]"+driver.getTitle());
Thread.sleep(5000);
driver.navigate().refresh();
Thread.sleep(5000);
driver.quit();

	}

}
