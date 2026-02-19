package maahi.dec18;

public class Two_Dimension {
public static void main(String[] args) {
	String login[][]=new String[5][2];
	login[0][0]="admin1";
	login[0][1]="test1";
	login[1][0]="admin2";
	login[1][1]="test2";
	login[2][0]="admin3";
	login[3][1]="test3";
	login[3][0]="admin4";
	login[3][1]="test4";
	login[4][0]="admin5";
	login[4][1]="test5";
	//print row length
	System.out.println("Row length is  "+login.length);
	System.out.println("No.of cells in first row   "+login[0].length);
	//before update
	System.out.println("Before update     "+login[3][0]);
	login[3][0]="maahi";
	
	//after update
	System.out.println("After update  "+ login[3][0]);
	//iterate all row
			for(int i=0;i<login.length;i++)
			{
				//iterate each row cell length
				for(int j=0;j<login[j].length;j++)
				{
					System.out.print(login[i][j] + "\t");
				}
					
				System.out.println();
				
				
				
				
			}

}
}
