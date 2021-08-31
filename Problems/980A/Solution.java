import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s = bi.readLine();
		int x = 0;
		int y = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'o') {
				x++;
			} else {
				y++;
			}
		}
		if (x == 0 || y == 0) {
			System.out.println("YES");
		} else {
			if (x > y) {
				System.out.println("NO");
			} else if (y % x == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}
}

