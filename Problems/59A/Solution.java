import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int l = 0;
		int u = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				l++;
			} else {
				u++;
			}
		}
		System.out.println(l >= u ? s.toLowerCase() : s.toUpperCase());

	}
}