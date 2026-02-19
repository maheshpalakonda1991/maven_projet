package maahi_dec30;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Verify_Url {

	private static final String Expected_title = null;

	public static void main(String[] args) throws Throwable {
		// create instance object 
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("http://google.com");
Thread.sleep(5000);
//get title in runtime
String actual_title = driver.getTitle();
if(actual_title.equalsIgnoreCase(Expected_title))
{
System.out.println("Title is Matching    "+Expected_title+"     "+actual_title+"   "+"Test pass");
}
else
{
	
System.out.println("Title is Matching    "+Expected_title+"     "+actual_title+"   "+"Test fail");
}
driver.quit();
	}
}
