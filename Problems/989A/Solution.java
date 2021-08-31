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
		boolean found = false;
		for (int i = 1; i < s.length() - 1; i++) {
			if (s.charAt(i) != '.' && s.charAt(i + 1) != '.' && s.charAt(i - 1) != '.' && s.charAt(i) != s.charAt(i - 1)
					&& s.charAt(i) != s.charAt(i + 1) && s.charAt(i + 1) != s.charAt(i - 1)) {
				found = true;
				break;
			}
		}
		System.out.println(found ? "Yes" : "No");
	}
}

