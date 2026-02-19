
package maahi.dec8;

public class Comparsion_operators {

	public static void main(String[] args) {

		int x=200,y=500,z=200;
		System.out.println(x==z);
		System.out.println(x==y);
		System.out.println(x==x);
		System.out.println(x!=z);
		System.out.println(x!=y);
		System.out.println(x!=x);
		System.out.println(x>z);
		System.out.println(x>y);
		System.out.println(y>x);
		System.out.println(y>z);

        System.out.println(z>x);
		System.out.println(z>y);
		System.out.println(x<y);
		System.out.println(y<z);
		System.out.println(z<y);
		System.out.println(x>=z);
		System.out.println(y>=y);
		System.out.println(x<=z);
		
		System.out.println(x==z && y>z);
		System.out.println(x!=z && y>z);
		System.out.println(x==z || y>x);
		System.out.println(x>z || y>z);
		System.out.println(x!=z || y==z);
		System.out.println(!(x==z));
		System.out.println(!(y==z));
		
		

	}

}
