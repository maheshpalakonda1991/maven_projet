package maahi_dec19;

import java.util.ArrayList;

public class DEMO1 {
public static void main(String[] args) {
	//store cars into arraylist class
	ArrayList<String> cars = new ArrayList<String>();
	cars.add("TATA Nexon");
	cars.add("TATA Altroz");
	cars.add("TATA Harrier");
	cars.add("TATA Safari");
	cars.add("TATA nano");
	cars.add("TATA Indica");
	cars.add("TATA tiago");
	cars.add("TATA Tigor");
	cars.add("TATA Curv");
	cars.add("TATA Punch");
	cars.add("TATA Sumo");
	System.out.println("Print no of elements in list  "+cars.size());
	System.out.println("Print specific element position  "+cars.get(5));
	for(int i=0;i<8;i++)
	{
		System.out.println(cars.get(i));
	}
	
	
	}

}
	
	




