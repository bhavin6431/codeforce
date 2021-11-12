import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		int sum[] = new int[30];
		sum[0] = 1;
		for (int k = 1; k < 30; k++) {
			sum[k] = (int) (sum[k - 1] + Math.pow(2, k));
		}

		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();

			int ansk = 0;
			for (int k = 1; k < 30; k++) {
				if (n % sum[k] == 0) {
					ansk = k;
					break;
				}

			}

			System.out.println(n / sum[ansk]);

		}
	}
}