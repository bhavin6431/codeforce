import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s = bi.readLine();
		int i = Integer.parseInt(s.substring(0, s.indexOf(" ")));
		int total = (7 * 31) + (4 * 30) + 29;
		int start = 5;
		int c1 = 0;
		int c2 = 0;
		int m = 1;
		int day = 1;
		while (total > 0) {
			if (start > 7) {
				start = 1;
			}

			if (start == i) {
				c1++;
			}
			if (day == i) {
				c2++;
			}
			if (m == 2 && day == 29) {
				day = 1;
				m++;
				start++;
				total--;
				continue;
			} else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && day == 31) {
				day = 1;
				m++;
				start++;
				total--;
				continue;
			} else if ((m == 4 || m == 6 || m == 9 || m == 11) && day == 30) {
				day = 1;
				m++;
				start++;
				total--;
				continue;
			} else {
				day++;
				start++;
				total--;
			}

		}

		if (s.contains("of week")) {
			System.out.println(c1);
		} else {
			System.out.println(c2);
		}
	}

}