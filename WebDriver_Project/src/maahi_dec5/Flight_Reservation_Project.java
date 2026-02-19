package maahi_dec5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight_Reservation_Project {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://flights.qedgetech.com/register.html");
		Thread.sleep(5000);
		WebElement Name=driver.findElement(By.xpath("//input[@id='name']"));
		Name.sendKeys("Mahesh");
		WebElement ContactNumber =driver.findElement(By.xpath("//input[@id='contact']"));
		ContactNumber.sendKeys("8897212731");
		WebElement EMail=driver.findElement(By.xpath("//input[@id='email']"));
		EMail.sendKeys("jackksparrow1999@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='address']"));
		password.sendKeys("Mahesh@1999");
		WebElement Gender=driver.findElement(By.xpath("//select[@name='gender']"));
		Gender.sendKeys("Male");
		WebElement DateOfBirth=driver.findElement(By.xpath("//input[@id='popupDatepicker']"));
		DateOfBirth.sendKeys("10-06-1999");
		WebElement Checkbox=driver.findElement(By.xpath("//label[contains(text(),'By Clicking Register button you agree to the QEdge')]"));
		Checkbox.click();
		WebElement RegisterButton=driver.findElement(By.xpath("//input[@name='submit']"));
		RegisterButton.click();
		driver.quit();
	}
		}
