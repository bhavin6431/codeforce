import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		String s1[] = bi.readLine().split(" ");
		int n = Integer.parseInt(s1[0]);
		int d = Integer.parseInt(s1[1]);

		long a[] = new long[n];
		String s[] = bi.readLine().split(" ");
		int t = 0;
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(s[i]);
			t += a[i];
		}
		if ((((n - 1) * 10) + t) > d) {
			System.out.println(-1);

		} else {
			int i = 0;
			int ans = 0;
			while (i < n - 1) {
				d -= a[i];
				d -= 10;
				if (d > 0) {
					ans += 2;
				}
				i++;
			}
			d -= a[n - 1];
			if (d >= 5) {
				ans += d / 5;
			}
			System.out.println(ans);
		}

	}
}