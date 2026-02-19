package maahi.dec18;

public class Using_objectArray {

	public static void main(String[] args) {
		// store different data type with multiple values
		Object str [] = new Object[5];
		str[0]="hello";
		str[1]=10000;
		str[2]="p";
		str[3]="45.45688";
		str[4]="true";
		System.out.println(str.length);
		for(Object  each : str) {
			System.out.println(each);
			
			
			
		}
		}
	}
