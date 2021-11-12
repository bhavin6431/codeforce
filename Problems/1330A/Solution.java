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
			String s1[] = bi.readLine().split(" ");

			int n = Integer.parseInt(s[0]);
			int x = Integer.parseInt(s[1]);

			int f[] = new int[103];
			for (int i = 0; i < n; i++) {
				f[Integer.parseInt(s1[i])]++;
			}
			int i = 1;
			while (x > 0 && i < 102) {
				if (f[i] > 0) {
					i++;
					continue;
				} else {
					i++;
					x--;
				}
			}
			while (f[i] > 0 && i < 102) {
				i++;
			}
			if (x > 0) {
				i = i + x;
			}

			System.out.println(i - 1);
			t--;
		}
	}

}