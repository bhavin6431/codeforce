import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bi.readLine());

		String s[] = bi.readLine().split(" ");
		int ans = 0;
		int max = 0;
		for (int i = 0; i < n * 2; i++) {
			if (s[i % n].equals("1")) {
				ans++;
			} else {
				max = Math.max(ans, max);
				ans = 0;

			}
		}

		System.out.println(Math.max(ans, max));

	}
}