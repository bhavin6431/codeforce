import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		Integer n = Integer.parseInt(bi.readLine());
		Integer m = Integer.parseInt(bi.readLine());

		boolean found = false;
		int x = 2;
		int y = 1;
		while (y < n) {
			if (x > m) {
				System.out.println(m);
				found = true;
				break;
			}

			x *= 2;
			y++;
		}
		if (!found) {
			if (x == m) {
				System.out.println(0);
			} else {
				System.out.println(m % x);
			}
		}
	}
}