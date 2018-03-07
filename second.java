package Assignment1;

public class second {
	public static void main(String args[]) throws Exception {
		for (int j = 0; j < 5; j += 2) {
			for (int a = 0; a <= j; a++) // for printing "#"
			{
				System.out.print("#");
			}
			System.out.println(" ");
		}

		for (int i = 3; i >= 1; i--) // for printing "*" 123
		{
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
