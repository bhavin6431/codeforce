import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		if (t >= 0) {
			System.out.println(t);
		} else {
			if (t > -10) {
				System.out.println(0);
			} else {
				String s = Integer.toString(t);
				System.out.println(Math.max(Integer.parseInt(s.substring(0, s.length() - 1)),
						Integer.parseInt(s.substring(0, s.length() - 2) + s.substring(s.length() - 1, s.length()))));

			}

		}
	}
}