package maahi_dec19;

public class Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        try {
            // divide any value with 0 (this will cause exception)
            int x = 765;
            int y = 0;
            int z = x / y;

            System.out.println(z);

        } catch (ArithmeticException e) {
            // handling the exception
            System.out.println("Error message: " + e.getMessage());
            e.printStackTrace();
        }

        // normal execution continues
        int a = 48304;
        int b = 8;
        int c = a / b;

        System.out.println("Division value: " + c);
    }
}
