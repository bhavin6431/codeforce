import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bi.readLine());
		String s[] = bi.readLine().split(" ");
		long a[] = new long[n];

		long total = (int) Math.ceil(4.5 * n);
		long totalnow = 0;
		for (int i = 0; i < n; i++) {
			totalnow += Long.parseLong(s[i]);
			a[i] = Long.parseLong(s[i]);
		}
		Arrays.sort(a);
		long diff = total - totalnow;
		if (diff < 0) {
			System.out.println(0);
		} else {
			int i = 0;
			int c = 0;
			while (diff > 0) {
				if (a[i] != 5) {
					diff -= 5 - a[i];
					c++;
				}
				i++;
			}
			System.out.println(c);
		}

	}
}
