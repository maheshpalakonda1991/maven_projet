package maahi_dec20;

public class Equals_Equalignorecase {

	public static void main(String[] args) {
		// it compares string1 and string2 and returns true if equals or returns false not equals
		//equalsIgnoreCase()-it compares string1 and string2 by ignoring case sensitive and true or false
		String str1 ="Google";
		String str2="Google";
		String str3="google";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str3));
		
	}

}
