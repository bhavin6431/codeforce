import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bi.readLine());
		while (t > 0) {
			int n = Integer.parseInt(bi.readLine());
			String s[] = bi.readLine().split(" ");
			long rem = 0;
			boolean fail = false;
			for (int i = 0; i < n; i++) {
				long h = Long.parseLong(s[i]);

				if (rem + h < i) {
					fail = true;
					break;
				}
				rem += Long.parseLong(s[i]) - i;
			}

			if (fail) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
			t--;
		}
	}
}