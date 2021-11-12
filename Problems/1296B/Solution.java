import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while (t > 0) {

			String s[] = scan.nextLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int x = n;
			int ans = 0;
			if (n < 10) {
				System.out.println(n);
			} else {
				while (x >= 10) {
					ans += (x / 10) * 10;
					x = (x / 10) + (x % 10);
				}
				System.out.println(ans + x);
			}
			t--;
		}
	}
}