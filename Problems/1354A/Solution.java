import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.nextLine());
		while (t > 0) {

			String[] s = scan.nextLine().split(" ");
			long a[] = new long[s.length];
			for (int i = 0; i < s.length; i++) {
				a[i] = Integer.parseInt(s[i]);
			}
			if (a[1] >= a[0]) {
				System.out.println(a[1]);
				t--;
				continue;
			}

			if (a[2] <= a[3]) {
				System.out.println(-1);
				t--;
				continue;
			}

			long rem = a[0] - a[1];
			long gap = a[2] - a[3];
			if (rem % gap == 0) {
				System.out.println((long) a[1] + (long) ((rem / gap) * a[2]));
			} else {
				System.out.println((long) a[1] + (long) (((rem / gap) + 1) * a[2]));

			}

			t--;
		}
	}
}