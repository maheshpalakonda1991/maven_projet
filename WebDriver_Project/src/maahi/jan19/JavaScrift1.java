package maahi.jan19;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScrift1 {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.location='https:/tatacliq.com/'");
    Thread.sleep(5000);
    //print title and length of title
    String page_title = js.executeScript("return documetnt.title").toString();
    System.out.println("page_title");
    System.out.println(page_title.length());
    //print url and length of url
    String str_Url=js.executeScript("return document.URL").toString();
    System.out.println(str_Url);
    System.out.println(str_Url.length());
    //print domain and length of domaim
    String str_Domain=js.executeScript("return document.domain").toString();
    System.out.println(str_Domain);
  System.out.println(str_Domain.length());
  driver.quit();
  
}

}
