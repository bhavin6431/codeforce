import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scan.nextInt();
		scan.nextLine();
		// int[] a =
		// Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		// String s = scan.nextLine();

		// int m = scan.nextInt();
		// scan.nextLine();
		// int c = 0;
		// int[] b =
		// Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
//		boolean found = false;

		// int c = 0;
		boolean p[] = new boolean[3];

		p[0] = true;
		p[1] = true;
		p[2] = false;
		boolean found = true;
		for (int i = 0; i < n; i++) {
			int win = scan.nextInt();
			scan.nextLine();
			if (!p[win - 1]) {
				found = false;
				break;
			}
			if (win == 1) {
				p[1] = !p[1];
				p[2] = !p[2];
			} else if (win == 2) {
				p[0] = !p[0];
				p[2] = !p[2];
			} else if (win == 3) {
				p[0] = !p[0];
				p[1] = !p[1];
			}
		}

		System.out.println(found ? "YES" : "NO");
	}
}

