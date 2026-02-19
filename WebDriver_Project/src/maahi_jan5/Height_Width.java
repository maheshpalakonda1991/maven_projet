package maahi_jan5;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Height_Width {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		//get username height and width
		WebElement username = driver.findElement(By.name("txtUsername"));
		Dimension dim = username.getSize();
		System.out.println("Height is   "+dim.getHeight()+"   "+"Width is   "+dim.getWidth());
		//get login button height and width
		WebElement loginbtn = driver.findElement(By.name("Submit"));
		Dimension dim1 = loginbtn.getSize();
	System.out.println("Height is   "+dim1.getHeight()+"   "+"Width is     "+dim1.getWidth());
	driver.quit();
	}
}
