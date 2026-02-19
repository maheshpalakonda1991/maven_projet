
public class Split {

	public static void main(String[] args) {
		// it is used to split string into array collection
		String dob = "22-December-2025";
		String temp[]=dob.split("-");
		String date = temp[0];
		String month =  temp[1];
		String year = temp[2];
		System.out.println(date);
		System.out.println(month);
		System.out.println(year);
		

	}
	

}
