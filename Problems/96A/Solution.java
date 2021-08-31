import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char[] c = s.toCharArray();
		int prev = c[0];
		int count = 1;
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			if (prev == c[i]) {
				count++;
			} else {
				count = 1;
				prev = c[i];
			}
			if (count == 7) {
				flag = true;
				break;
			}
		}

		System.out.println(flag ? "YES" : "NO");
	}

}