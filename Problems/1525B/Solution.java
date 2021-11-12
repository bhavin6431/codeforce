import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		Integer t = Integer.parseInt(bi.readLine());
		while (t > 0) {
			Integer n = Integer.parseInt(bi.readLine());

			String s[] = bi.readLine().split(" ");
			int start = Integer.parseInt(s[0]);
			int end = Integer.parseInt(s[n - 1]);
			boolean sorted = true;
			for (int i = 0; i < n; i++) {
				if (Integer.parseInt(s[i]) != i + 1) {
					sorted = false;
					break;
				}
			}
			if (sorted) {
				System.out.println("0");
			} else if (start == 1 || end == n) {
				System.out.println("1");
			} else if (start == n && end == 1) {
				System.out.println("3");
			} else {
				System.out.println("2");
			}

			t--;
		}
	}
}