import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while (t > 0) {
			String s[] = scan.nextLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int n = Integer.parseInt(s[2]);
			int m = Integer.parseInt(s[1]);

			int maxx = 20;

			while (x > 0 && (x > maxx && m > 0)) {
				x = (int) Math.floor((x / 2) + 10);
				m--;
			}
			while (x > 0 && n > 0) {
				x -= 10;
				n--;
			}
			if (x <= 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

			t--;
		}

	}

}