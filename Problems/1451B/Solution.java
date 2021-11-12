import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bi.readLine());
		while (t > 0) {
			String s[] = bi.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int q = Integer.parseInt(s[1]);
			String s1 = bi.readLine();
			int dp[][] = new int[s1.length()][2];
			int dpr[][] = new int[s1.length()][2];
			dp[0][0] = s1.charAt(0) == '0' ? 1 : 0;
			dp[0][1] = s1.charAt(0) == '1' ? 1 : 0;

			dpr[n - 1][0] = s1.charAt(n - 1) == '0' ? 1 : 0;
			dpr[n - 1][1] = s1.charAt(n - 1) == '1' ? 1 : 0;

			for (int i = 0; i < n; i++) {
				if (i != 0) {
					if (s1.charAt(i) == '0') {
						dp[i][0] = dp[i - 1][0] + 1;
						dp[i][1] = dp[i - 1][1];
					} else {
						dp[i][0] = dp[i - 1][0];
						dp[i][1] = dp[i - 1][1] + 1;
					}
					if (s1.charAt(n - i - 1) == '0') {
						dpr[n - i - 1][0] = dpr[n - i][0] + 1;
						dpr[n - i - 1][1] = dpr[n - i][1];
					} else {
						dpr[n - i - 1][0] = dpr[n - i][0];
						dpr[n - i - 1][1] = dpr[n - i][1] + 1;
					}
				}
			}
			while (q > 0) {
				String s2[] = bi.readLine().split(" ");

				int l = Integer.parseInt(s2[0]) - 1;
				int r = Integer.parseInt(s2[1]) - 1;
				int lul = -1;
				int lur = n;
				int lucl = s1.charAt(l) == '0' ? 0 : 1;
				int lucr = s1.charAt(r) == '0' ? 0 : 1;
				if (l - 1 >= 0) {
					lul = l - 1;
				}
				if (r + 1 < n) {
					lur = r + 1;
				}

				if (lul >= 0 || lur < n) {
					boolean found = false;
					if (lul >= 0) {
						if (dp[lul][lucl] > 0) {
							found = true;
						}
					}
					if (!found && lur < n) {
						if (dpr[lur][lucr] > 0) {
							found = true;
						}
					}
					if (found) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				} else {
					System.out.println("NO");
				}

				q--;
			}

			System.out.println();
			t--;
		}
	}

}