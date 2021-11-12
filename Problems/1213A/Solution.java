import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bi.readLine());
		String s[] = bi.readLine().split(" ");
		long c[] = new long[n];
		long a[] = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(s[i]);
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i; j < n; j++) {
				if (Math.abs(a[i] - a[j]) % 2 != 0) {
					c[i]++;
					c[j]++;
				}
			}
		}
		long min = Long.MAX_VALUE;
		for (int i = 0; i < c.length; i++) {
			min = Math.min(min, c[i]);
		}
		System.out.println(min);
	}
}