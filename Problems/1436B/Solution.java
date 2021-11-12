import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		boolean p[] = new boolean[202];
		Arrays.fill(p, true);
		int i = 2;
		while (i * i <= 200) {
			if (p[i] == true) {
				int k = i * i;
				while (k <= 200) {
					p[k] = false;
					k += i;
				}
			}
			i++;
		}

		Integer t = Integer.parseInt(bi.readLine());
		while (t > 0) {
			Integer n = Integer.parseInt(bi.readLine());
			int start = n;

			while (true) {
				if (p[start]) {
					if (!p[start - (n - 1)]) {
						break;
					}
				}
				start++;
			}

			for (i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == j) {
						if (p[n]) {
							System.out.print("1 ");
						} else {
							System.out.print((start - (n - 1)) + " ");
						}
					} else {
						System.out.print("1 ");
					}
				}
				System.out.println();
			}
			t--;
		}
	}
}