package maahi.dec17;

public class Singl_dimension1 {

	public static void main(String[] args) {
		// store integer values into array
		int num[]= new int [5];
		num[0]=100;
		num[1]=200;
		num[2]=300;
		num[3]=400;
		num[4]=500;
		System.out.println("Array size is   "+num.length);
		System.out.println("print specific index position value   "+num[2]);
		//update 300 t0 1000
		num[2]=1000;
		System.out.println("after update   "+num[2]);
		//i want to print to print 0 to 4 foreach loop
for (int each : num) {
	System.out.println(each);
	
}
			}
}
