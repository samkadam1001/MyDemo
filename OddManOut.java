package first;

import java.util.Scanner;

public class OddManOut {

	private void printOutPut(char[] dataToPrint) {
		for (char c : dataToPrint) {
			System.out.print(c + ",");
		}
	}

	public static void main(String args[]) {
		System.out.println("Enter a String :");
		Scanner sc = new Scanner(System.in);
		String string1 = sc.nextLine();
		int length = string1.length();
		int word = 0, num = 0, sp = 0;
		char unmatched, flag;
		char[] numbeCharArr = new char[string1.length()];
		char[] wordCharar = new char[string1.length()];
		char[] spcharar = new char[string1.length()];
		for (int iterator = 0; iterator < length; iterator++) {
			if ((string1.charAt(iterator) >= 'a' && string1.charAt(iterator) <= 'z')
					|| (string1.charAt(iterator) >= 'A' && string1.charAt(iterator) <= 'Z')) {
				wordCharar[word] = string1.charAt(iterator);
				word++;

			} else if (string1.charAt(iterator) >= '0' && string1.charAt(iterator) <= '9') {
				numbeCharArr[num] = string1.charAt(iterator);
				num++;
			} else {
				spcharar[sp] = string1.charAt(iterator);
				sp++;
			}
		}
		OddManOut oddManOut = new OddManOut();
		if (word < num && word < sp) {
			oddManOut.printOutPut(wordCharar);
		} else if (num < word && num < sp) {
			oddManOut.printOutPut(numbeCharArr);
		} else if (sp < word && sp < num) {
			oddManOut.printOutPut(spcharar);
		}
		/*
		 * for (int iterator = 0; iterator < length; iterator++) { if
		 * ((string1.charAt(iterator) >= 'a' && string1.charAt(iterator) <= 'z') ||
		 * (string1.charAt(iterator) >= 'A' && string1.charAt(iterator) <= 'Z')) { flag
		 * = 'w'; } else if (string1.charAt(iterator) >= '0' && string1.charAt(iterator)
		 * <= '9') { flag = 'n'; } else flag = unmatched;
		 * 
		 * if (unmatched == flag) { System.out.print(string1.charAt(iterator) + ""); } }
		 */
		sc.close();
	}

}