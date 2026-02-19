package maahi_dec20;

public class Contains {

	public static void main(String[] args) {
		//it check given string contains specified seq chars in a string return true or false
		String str1="http://webapp.qedgetech.com/dashboard.php";
		String str2 ="dashboard";
		String str3="http:";
		System.out.println(str1.contains(str2));
		System.out.println(str1.contains(str3));
	}

}
