import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		// int n = scan.nextInt();
		// scan.nextLine();
		// int[] a =
		// Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		String s = scan.nextLine();

		// int m = scan.nextInt();
		// scan.nextLine();
		// int c = 0;
		// int[] b =
		// Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
//		boolean found = false;
		int c = 1;

		for (int i = 0; i < s.length(); i++) {
			String ans = "";
			for (int j = s.length() - i - 1; j < s.length(); j++) {
				ans += s.charAt(j) + "";
			}
			for (int k = 0; k < s.length() - i - 1; k++) {
				ans += s.charAt(k) + "";
			}

			if (!ans.equals(s)) {
				c++;
			} else {
				break;
			}
		}

		System.out.println(c);
	}
}

