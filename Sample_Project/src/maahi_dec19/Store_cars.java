package maahi_dec19;

import java.util.ArrayList;

public class Store_cars {

	public static void main(String[] args) {
		// store cars into arraylist class
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
		for (String each : cars) {
			System.out.println(each);
		}

	}

}
