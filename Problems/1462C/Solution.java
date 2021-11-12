import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		int ans[] = new int[46];
		int k = 9;
		int m = 0;
		int prev = 0;
		int n = 45;
		while (n > 0) {

			for (int i = 1; i <= k; i++) {
				ans[45 - n] = (int) (Math.pow(10, m) * i) + prev;
				if (i == k) {
					prev = (int) (Math.pow(10, m) * i) + prev;
				}
				n--;
			}
			k--;
			m++;

		}

		while (t > 0)

		{
			int v = Integer.parseInt(scan.nextLine());
			if (v > 45) {
				System.out.println(-1);
			} else {
				System.out.println(ans[v - 1]);
			}
			t--;
		}
	}
}