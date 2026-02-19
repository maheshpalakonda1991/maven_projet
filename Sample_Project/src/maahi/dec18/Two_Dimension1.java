package maahi.dec18;

import java.util.Iterator;

public class Two_Dimension1 {

	public static void main(String[] args) {
		String login[][]= {
				{"admin1","test1"},
				{"admin2","test2"},
				{"admin3","test3"},
				{"admin4","test4"}};
	System.out.println("rows lenth is :: "+login.length);
		System.out.println("Any row cell length  "+login[2].length);
		System.out.println(login[1][1]);
	for(int row =0;row<login.length;row++)
	{
		for(int col =0;col<login[row].length;col++)
		{
			System.out.println(login[row][col]+"\t");
			
		}
			
				System.out.println();
		}

	}

}
