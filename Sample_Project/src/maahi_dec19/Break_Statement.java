package maahi_dec19;

import java.util.ArrayList;

public class Break_Statement {

	public static void main(String[] args) {
		// once i reached four at four print up to four and then exit
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
			if(i==4)
				break;
			{
				System.out.println(cars.get(i));
				
			}
		}

	}

}
