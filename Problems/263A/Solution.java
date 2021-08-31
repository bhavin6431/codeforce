import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sr = 0;
		int sc = 0;

		for (int i = 0; i < 5; i++) {
			String s[] = scan.nextLine().split(" ");
			for (int j = 0; j < s.length; j++) {
				if (s[j].equals("1")) {
					sr = i;
					sc = j;
					break;
				}
			}
		}

		System.out.println(Math.abs(2 - sr) + Math.abs(2 - sc));

	}

}