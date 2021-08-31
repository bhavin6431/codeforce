import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s[] = bi.readLine().split(" ");
		String s1[] = bi.readLine().split(" ");
		String s2[] = bi.readLine().split(" ");
		if (s2.length > 1) {
			System.out.println("Yes");
		} else {
			int n = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			int val = Integer.parseInt(s2[0]);
			int prev = Integer.parseInt(s1[0]);
			boolean increasing = true;
			for (int i = 0; i < n; i++) {
				if (s1[i].equals("0")) {
					if ((i - 1 >= 0 && Integer.parseInt(s1[i - 1]) > val)
							|| (i + 1 < n && Integer.parseInt(s1[i + 1]) < val)) {

						increasing = false;
						break;
					}
				} else {
					if (prev > Integer.parseInt(s1[i])) {
						increasing = false;
						break;
					}
					prev = Integer.parseInt(s1[i]);
				}

			}
			System.out.println(increasing ? "No" : "Yes");

		}
	}
}
