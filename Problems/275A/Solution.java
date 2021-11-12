import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		// Integer t = Integer.parseInt(bi.readLine());
		int a[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			Arrays.fill(a[i], 1);
		}
		// while (t > 0) {
		for (int i = 0; i < 3; i++) {
			String s[] = bi.readLine().split(" ");
			for (int j = 0; j < 3; j++) {
				if (Integer.parseInt(s[j]) % 2 != 0) {
					a[i][j] = a[i][j] == 0 ? 1 : 0;
					// if (i - 1 >= 0 && j - 1 >= 0) {
					// a[i - 1][j - 1] = a[i - 1][j - 1] == 0 ? 1 : 0;
					// }
					if (i - 1 >= 0) {
						a[i - 1][j] = a[i - 1][j] == 0 ? 1 : 0;
					}
					// if (i - 1 >= 0 && j + 1 < 3) {
					// a[i - 1][j + 1] = a[i - 1][j + 1] == 0 ? 1 : 0;
					// }
					if (j - 1 >= 0) {
						a[i][j - 1] = a[i][j - 1] == 0 ? 1 : 0;
					}
					if (j + 1 < 3) {
						a[i][j + 1] = a[i][j + 1] == 0 ? 1 : 0;
					}
					if (i + 1 < 3) {
						a[i + 1][j] = a[i + 1][j] == 0 ? 1 : 0;
					}
					// if (i + 1 < 3 && j - 1 >= 0) {
					// a[i + 1][j - 1] = a[i + 1][j - 1] == 0 ? 1 : 0;
					// }
					// if (i + 1 < 3 && j + 1 < 3) {
					// a[i + 1][j + 1] = a[i + 1][j + 1] == 0 ? 1 : 0;
					// }
				}
			}

		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		// t--;
		// }
	}
}