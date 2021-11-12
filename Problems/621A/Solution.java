import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bi.readLine());
		String s[] = bi.readLine().split(" ");
		int co = 0;
		int smallestOldd = Integer.MAX_VALUE;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			int val = Integer.parseInt(s[i]);
			if (val % 2 != 0) {
				co++;
				smallestOldd = Math.min(smallestOldd, val);
			}
			sum += val;
		}

		if (co % 2 != 0) {
			sum -= smallestOldd;
		}
		System.out.println(sum);

	}

	static int cal(int p, int t) {
		return Math.max((3 * p) / 10, p - ((p / 250) * t));
	}
}