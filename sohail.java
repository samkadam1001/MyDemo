package first;

public class sohail {
	public static void main(String args[]) {
		int alphabet = 65;
		for (int i = 1; i <= 3; i++) {
			alphabet = 65;
			for (int sp = 3; sp > i; sp--) // for Printing "Space"
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) // printing "triangle of alphabets"
			{
				System.out.print((char) (alphabet) + " ");
				alphabet++;
			}

			System.out.println(" ");
		}

	}

}
