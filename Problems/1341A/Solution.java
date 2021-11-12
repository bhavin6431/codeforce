import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while (t > 0) {
			String s[] = scan.nextLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int a = Integer.parseInt(s[2]);
			int d = Integer.parseInt(s[3]);
			int c = Integer.parseInt(s[4]);

			int minWt = b - a;
			int maxWt = b + a;

			int minW = d - c;
			int maxW = d + c;

			if (minWt * n > maxW || maxWt * n < minW) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
			t--;
		}
	}
}