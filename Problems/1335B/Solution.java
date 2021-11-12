import java.util.Scanner;

public final class Solution {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while (t > 0) {
			String s[] = scan.nextLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int a = Integer.parseInt(s[1]);
			int b = Integer.parseInt(s[2]);
			char[] c = new char[n];

			// b
			int count = 0;
			for (int i = 0; i < b; i++) {
				c[count++] = (char) (97 + i);
			}

			a = a - b;
			for (int i = 0; i < a; i++) {
				c[count++] = c[i];
			}

			n = n - a - b;

			for (int i = 0; i < n; i++) {
				c[count++] = c[i];
			}
			System.out.println(new String(c));
			t--;
		}

	}
}