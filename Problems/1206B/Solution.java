import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bi.readLine());
		long a[] = new long[n];
		String s[] = bi.readLine().split(" ");
		long dp[][] = new long[n][2];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(s[i]);
		}

		dp[0][0] = Math.abs(a[0] - 1);
		dp[0][1] = Math.abs(a[0] + 1);

		for (int i = 1; i < n; i++) {
			long pos = Math.abs(a[i] - 1);
			long neg = Math.abs(a[i] + 1);
			dp[i][0] = Math.min(dp[i - 1][0] + pos, dp[i - 1][1] + neg);
			dp[i][1] = Math.min(dp[i - 1][0] + neg, dp[i - 1][1] + pos);
		}
		;
		System.out.println(dp[n - 1][0]);
	}
}