import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();

		while (t > 0) {
			String s = scan.nextLine();
			int c1 = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1') {
					c1++;
				}
			}
			int c0 = s.length() - c1;
			if (c0 > 0 && c1 > 0) {
				int min = Math.min(c0, c1);
				if (min % 2 != 0) {
					System.out.println("DA");
				} else {
					System.out.println("NET");
				}
			} else {
				System.out.println("NET");
			}
			t--;
		}
	}
}