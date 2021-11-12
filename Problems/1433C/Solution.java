import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.nextLine());

		while (t > 0) {
			int n = Integer.parseInt(scan.nextLine());
			int a[] = new int[n];
			String[] s = scan.nextLine().split(" ");
			int max = 0;
			boolean h[] = new boolean[n];
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(s[i]);
				max = Math.max(max, a[i]);
			}
			boolean found = false;
			int ans = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] == max) {
					if (i == 0) {
						if (a[i] > a[i + 1]) {
							found = true;
							ans = i;
							break;
						}
					} else if (i == n - 1) {
						if (a[i] > a[i - 1]) {
							found = true;
							ans = i;
							break;
						}
					} else {
						if (a[i] > a[i - 1] || a[i] > a[i + 1]) {
							found = true;
							ans = i;
							break;
						}
					}
				}
			}
			if (found) {
				System.out.println(ans + 1);
			} else {
				System.out.println(-1);
			}
			t--;
		}
	}
}