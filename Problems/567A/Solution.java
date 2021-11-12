import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int a[] = new int[n];
		String[] s = scan.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				System.out.println((a[i + 1] - a[i]) + " " + (a[n - 1] - a[i]));
			} else if (i == n - 1) {
				System.out.println((a[i] - a[i - 1]) + " " + (a[i] - a[0]));
			} else {
				System.out.println(
						Math.min(a[i] - a[i - 1], a[i + 1] - a[i]) + " " + Math.max(a[i] - a[0], a[n - 1] - a[i]));
			}
		}
	}
}