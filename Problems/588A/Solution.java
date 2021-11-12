import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bi.readLine());

		int p[] = new int[n];
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			String s[] = bi.readLine().split(" ");
			a[i] = Integer.parseInt(s[0]);
			p[i] = Integer.parseInt(s[1]);
		}

		int ans = 0;
		int i = 0;
		int total = 0;
		while (i < n) {
			if (i == n - 1) {
				total += a[i] * p[i];
				i++;
			} else {
				if (p[i] > p[i + 1]) {
					total += a[i] * p[i];
					i++;
				} else {
					int minp = p[i];

					while (minp <= p[i]) {
						total += minp * a[i];
						i++;
						if (i > n - 1) {
							break;
						}
					}
				}
			}
		}
		System.out.println(total);
	}
}