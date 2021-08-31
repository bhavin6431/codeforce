import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bi.readLine());

		String r1[] = bi.readLine().split(" ");
		String c1[] = bi.readLine().split(" ");

		long r[] = new long[n];
		long c[] = new long[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			r[i] = Long.parseLong(r1[i]);
			sum += r[i];
			c[i] = Long.parseLong(c1[i]);
		}
		Arrays.sort(c);
		if (c[n-1] + c[n -2] >= sum || n == 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");

		}
	}

}