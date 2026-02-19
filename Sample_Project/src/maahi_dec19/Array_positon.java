package maahi_dec19;


import java.util.ArrayList;

public class Array_positon {

	public static void main(String[] args) {
		// once i reaches at four print up to four
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
		for(int i=0;i<cars.size();i++)
		{
if(i<=4)
{
	System.out.println(cars.get(i));
}
}
	
	}

}
