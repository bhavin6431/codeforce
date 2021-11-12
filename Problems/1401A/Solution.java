import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while (t > 0) {

			String s[] = scan.nextLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int k = Integer.parseInt(s[1]);
			if (a == 0) {
				System.out.println(k);
				t--;
				continue;
			}
			if (k <= a) {
				if ((k % 2 == 0 && a % 2 == 0) || (k % 2 != 0 && a % 2 != 0)) {
					System.out.println(0);
					t--;
					continue;
				} else {
					System.out.println(1);
					t--;
					continue;
				}
			} else {
				System.out.println(k - a);
				t--;
				continue;
			}

		}
	}
}