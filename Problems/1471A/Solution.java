import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bi.readLine());
		while (t > 0) {
			String[] s1 = bi.readLine().split(" ");
			String[] s2 = bi.readLine().split(" ");
			int n = Integer.parseInt(s1[0]);
			long x = Long.parseLong(s1[1]);
			long maxb = 0;
			double total = 0;
			for (int i = 0; i < n; i++) {
				double v = Long.parseLong(s2[i]);
				maxb += Math.ceil(v / x);
				total += v;
			}

			System.out.println((long) Math.ceil(total / x) + " " + (long) maxb);
			t--;
		}
	}
}