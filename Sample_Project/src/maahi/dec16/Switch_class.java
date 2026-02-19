package maahi.dec16;

import java.util.Scanner;

public class Switch_class {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
for(int i=1;i<=10;i++)
{
	System.out.println("Enter your Browser");
	String browser = s.next();
	switch (browser.toUpperCase()) {
	case "CHROME":
		System.out.println("Executing in chrome browser");
		break;
	case "FIREFOX":
		System.out.println("Executing in chrome browser");
		break;
	case "SAFARI":
		System.out.println("Executing in chrome browser");
		break;
		case "OPERA":
			System.out.println("Executing in chrome browser");
			break;
			
	default:
		System.out.println("bRowser VALUE IS NOT MATCHING");
		break;
	}
}
	}
}
