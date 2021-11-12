import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s[] = bi.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int l = Integer.parseInt(s[1]);
		int r = Integer.parseInt(s[2]);

		long min = (long) (Math.pow(2, l) - 1) + (n - l);

		long max = 0;
		if (r == 1) {
			max = n;
		}
		if (r >= n) {
			max = (long) Math.pow(2, n) - 1;
		} else {
			int rem = n - r;
			max = (long) Math.pow(2, r) - 1 + (long) Math.pow(2, r - 1) * rem;
		}

		System.out.println(min + " " + max);
	}
}