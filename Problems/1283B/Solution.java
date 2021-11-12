import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bi.readLine());
		while (t > 0) {
			String s[] = bi.readLine().split(" ");
			long n = Integer.parseInt(s[0]);
			long k = Integer.parseInt(s[1]);
			if (k >= n) {
				if (k == n) {
					System.out.println(n);
				} else {
					System.out.println(Math.min(n, k / 2));
				}
			} else {
				if (n % k == 0) {
					System.out.println(n);

				} else {

					long rem = n % k;
					long m = (long) Math.floor(k / 2);
					if (rem <= m) {
						System.out.println(n);
					} else {
						System.out.println(n - (rem - m));
					}
				}
			}
			t--;
		}
	}
}