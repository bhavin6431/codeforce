import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		String[] s = new String[t];
		scan.nextLine();
		for (int i = 0; i < t; i++) {
			s[i] = scan.nextLine();
			if (s[i].length() > 10) {
				s[i] = s[i].charAt(0) + "" + (s[i].length() - 2) + s[i].charAt(s[i].length() - 1);
			}
		}
		for (int i = -0; i < t; i++) {
			System.out.println(s[i]);
		}
	}

}