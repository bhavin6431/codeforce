import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String s[] = scan.nextLine().split(" ");
		long i = Long.parseLong(s[0]);
		long j = Long.parseLong(s[1]);

		if (i % 2 == 0) {
			if (j <= i / 2) {
				// 10
				// 3
				System.out.println(((j - 1) * 2) + 1);
			} else {
				// 10
				// 6
				System.out.println((j - (i / 2)) * 2);
			}
		} else {
			// 7
			// 4
			if (j == (i / 2) + 1) {
				System.out.println(i);

			} else
			// 7
			// 2
			if (j <= i / 2) {
				System.out.println(((j - 1) * 2) + 1);
			} else {
				// 7
				// 7
				System.out.println((j - ((i / 2) + 1)) * 2);
			}
		}
	}
}