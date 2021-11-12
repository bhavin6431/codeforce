import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import sun.swing.StringUIClientPropertyKey;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bi.readLine());
		while (t > 0) {
			int n = Integer.parseInt(bi.readLine());
			StringBuilder sb1 = new StringBuilder("98");
			StringBuilder sb = new StringBuilder("9012345678");
			StringBuilder ans = new StringBuilder();
			if(n == 1) {
				ans.append("9");
			} else if(n == 2) {
				ans.append("98");
			} else {
				ans.append("98");
				n -=2;
				while (n > 0) {
					if (n > 10) {
						n -= 10;
						ans.append(sb.toString());
					} else {
						ans.append(sb.substring(0, n));
						break;
					}
				}
			}
			System.out.println(ans.toString());
			t--;
		}
		System.out.println();
	}
}