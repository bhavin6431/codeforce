import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bi.readLine());
		int[][] dp = new int[2000][3];
		boolean dp1[] = new boolean[2000];
		Arrays.fill(dp1, false);
		for (int i = 0; i < 2000; i++) {
			dp[i][0] = 0;
			dp[i][1] = 0;
			dp[i][2] = 0;

		}

		dp[3][0] = 1;
		dp[5][1] = 1;
		dp[7][2] = 1;

		dp1[3] = true;
		dp1[5] = true;
		dp1[7] = true;

		for (int i = 0; i < 1010; i++) {
			if (!dp1[i + 3] && dp1[i]) {
				dp[i + 3][0] = dp[i][0] + 1;
				dp[i + 3][1] = dp[i][1];
				dp[i + 3][2] = dp[i][2];
				dp1[i + 3] = true;
			}

			if (!dp1[i + 5] && dp1[i]) {
				dp[i + 5][1] = dp[i][1] + 1;
				dp[i + 5][0] = dp[i][0];
				dp[i + 5][2] = dp[i][2];
				dp1[i + 5] = true;
			}

			if (!dp1[i + 7] && dp1[i]) {
				dp[i + 7][2] = dp[i][2] + 1;
				dp[i + 7][0] = dp[i][0];
				dp[i + 7][1] = dp[i][1];
				dp1[i + 7] = true;
			}

		}

		while (t > 0)

		{
			int n = Integer.parseInt(bi.readLine());
			
			System.out.println(dp1[n] ? dp[n][0] + " " + dp[n][1] + " " + dp[n][2] : -1);
			t--;
		}
	}

}