package first;

public class karishma {
	public static void main(String args[]) throws Exception {

		// System.out.println(" #\n ###\n#####");

		for (int i = 1; i <= 5; i += 2) // top 3 lines printing
		{
			for (int sp = 5; sp > i; sp--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println("");
		}

		System.out.print("  "); // 2 Spaces

		for (int line = 1; line <= 5; line++) {
			System.out.print("#"); // 4th line printing
		}
		System.out.println("");

		for (int i = 1; i <= 2; i++) // 5th and 6th line printing
		{
			System.out.print("    ");

			for (int j = 2; j >= i; j--) {
				System.out.print("#");
			}

			System.out.println("");
		}

	}
}
