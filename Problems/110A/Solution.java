import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0;
		String s = scan.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '4' || s.charAt(i) == '7') {
				count++;
			}
		}
		System.out.println(count == 4 || count == 7 ? "YES" : "NO");
	}
}