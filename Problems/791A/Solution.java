import java.util.Arrays;
import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] s = scan.nextLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int count = 0;
		do {
			a = a * 3;
			b = b * 2;
			// System.out.println(a + " - " + b);
			count++;
		} while (a <= b);
		System.out.println(count);
	}

}