import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s1[] = bi.readLine().split(" ");
		int n = Integer.parseInt(s1[0]);
		long a[] = new long[n];
		int d = Integer.parseInt(s1[1]);
		String s2[] = bi.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(s2[i]);
		}
		long c = 0;
		Arrays.sort(a);
		for (int i = 1; i < n; i++) {
			if (a[i] - a[i - 1] > 2 * d) {
				c += 2;
			} else if (a[i] - a[i - 1] == 2 * d) {
				c++;
			}
		}

		System.out.println(c + 2);
	}
}
