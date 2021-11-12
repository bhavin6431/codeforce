import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		Integer t = Integer.parseInt(bi.readLine());
		while (t > 0) {
			String s = bi.readLine();
			int c1 = 0;
			int c2 = 0;
			boolean l = true;
			boolean r = true;
			if (s.length() % 2 != 0 || s.charAt(0) == s.charAt(s.length() - 1)) {
				System.out.println("NO");
			} else {
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(0) == s.charAt(i)) {
						c1++;
						c2++;
					} else if (s.charAt(s.length() - 1) == s.charAt(i)) {
						c1--;
						c2--;
					} else {
						c1++;
						c2--;
					}
					if (c1 < 0) {
						l = false;
					}
					if (c2 < 0) {
						r = false;
					}

				}
				if ((c1 == 0 && l) || (c2 == 0 & r)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
			t--;
		}
	}
}