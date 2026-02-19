package maahi.dec16;

import java.util.Scanner;

public class Scanner_VerifyGivenMarks {

	public static void main(String[] args) {
		// verify given marks true
		Scanner s = new Scanner(System.in);
		for(int i=1;i<=10;i++)
			
		{
		System.out.println("Enter your marks");
		int marks =s.nextInt();
		if(marks>=35)
		{
			System.out.println("pass   "+marks);
		}
		else
		{
			System.out.println("fail   "+marks);
		}
		}
	}

}
