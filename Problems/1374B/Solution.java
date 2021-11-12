import java.util.Scanner;

public final class Solution {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while (t > 0) {
			int n = scan.nextInt();
			int n1 = n;
			scan.nextLine();
			int move = 0;
			while (n > 1) {
				if (n % 6 == 0) {
					n /= 6;
				} else {
					n = n * 2;
					if (n % 6 != 0) {
						move = -1;
						break;
					}
				}
				move++;
			}
			System.out.println(move);
			t--;
		}

	}
}