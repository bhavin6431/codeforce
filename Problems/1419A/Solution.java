import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bi.readLine());
		while (t > 0) {
			int n = Integer.parseInt(bi.readLine());
			String s = bi.readLine();
			long rm = 0;
			long bm = 0;
			for (int i = 0; i < n; i++) {
				if ((i + 1) % 2 == 0) {
					if (Integer.parseInt(s.charAt(i) + "") % 2 == 0) {
						bm++;
					}
				} else {
					if (Integer.parseInt(s.charAt(i) + "") % 2 != 0) {
						rm++;
					}
				}
			}

			if (n % 2 == 0) {
				if (bm > 0) {
					System.out.println(2);
				} else {
					System.out.println(1);
				}
			} else {
				if (rm > 0) {
					System.out.println(1);
				} else {
					System.out.println(2);
				}
			}

			t--;
		}
	}

}