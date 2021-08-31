import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();
		String s1 = scan.nextLine();
		boolean flag = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.length() != s1.length()) {
				flag = false;
				break;
			}
			if (s.charAt(i) != s1.charAt(s1.length() - i - 1)) {
				flag = false;
				break;
			}
		}
		System.out.println(flag ? "YES" : "NO");
	}
}