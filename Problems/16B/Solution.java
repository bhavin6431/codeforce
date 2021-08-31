import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s[] = bi.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		long a[] = new long[m];
		long b[] = new long[m];

		for (int i = 0; i < m; i++) {
			String s1[] = bi.readLine().split(" ");
			a[i] = Long.parseLong(s1[0]);
			b[i] = Long.parseLong(s1[1]);
		}
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 0; i < m - 1; i++) {
				if (b[i] < b[i + 1]) {
					long tmp = b[i];
					long tmp1 = a[i];
					b[i] = b[i + 1];
					a[i] = a[i + 1];
					b[i + 1] = tmp;
					a[i + 1] = tmp1;
					swap = true;

				}
			}
		}

		long total = 0;
		int i = 0;
		while (n > 0 && i < m) {
			if (a[i] < n) {
				total += a[i] * b[i];
				n -= a[i];
				i++;
			} else {
				total += n * b[i];
				n = 0;
			}
		}
		System.out.println(total);
	}
}

