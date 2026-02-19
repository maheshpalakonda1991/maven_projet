package Qedge_dec26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;//any brower can also run but you must instal given browser in you pc or laptop

public class Get_Commends {

	public static void main(String[] args) throws Throwable {
		//create instance object
		WebDriver driver = new ChromeDriver();//firefox brower also run
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://flipkart.com");
		//suspend tool 5 sec
		Thread.sleep(5000);
		//print title of the page and print length of title
		String page_title = driver.getTitle();
		System.out.println(page_title.length());
		//print url length of url
		String str_url = driver.getCurrentUrl();
		System.out.println(str_url);
		System.out.println(str_url.length());
		//suspend tool 5 sec
		Thread.sleep(5000);
		//kill opened browser
		driver.quit();


	}

}
