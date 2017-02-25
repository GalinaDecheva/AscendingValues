import java.util.Scanner;

public class AscendingValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.print("Enter Value: ");
		a = input.nextInt();
		
		System.out.print("Enter Value: ");
		b = input.nextInt();
		
		if (a <= b)
		{
			System.out.println("Values in ascending are: " + a + "," + b);
		}
		else
		{
			System.out.print("Values in ascending are: " + b + "," + a);
		}
		
		input.close();

	}

}
