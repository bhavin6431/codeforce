import java.util.Scanner;

public final class Solution {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		// Set<Long> set = new HashSet<>();
		long j = 2;
//		do {
//			set.add(j);
//			j *= 2;
//		} while (j <= 10000000000000L);

		while (t > 0) {
			long n = scan.nextLong();

			if (n % 2 != 0) {
				System.out.println("YES");
			} else {
				while (n % 2 == 0) {
					n = n >> 1;
				}
				if (n > 1) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
			t--;
		}
	}

}