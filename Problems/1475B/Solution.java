import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		boolean[] dp = new boolean[1000000 + 2022];
		dp[2020] = true;
		dp[2021] = true;
		for (int i = 2020; i < dp.length - 2022; i++) {
			if (dp[i]) {
				dp[i + 2020] = true;
				dp[i + 2021] = true;
			}
		}

		while (t > 0) {
			int n = scan.nextInt();
			System.out.println(dp[n] ? "YES" : "NO");
			t--;
		}

	}
}