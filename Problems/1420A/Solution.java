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
			String[] s2 = bi.readLine().split(" ");
			int a[] = new int[n];
			boolean desc = true;
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(s2[i]);
				if (i > 0) {
					if (a[i - 1] <= a[i]) {
						desc = false;
						break;
					}
				}
			}
			if (!desc) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

			t--;
		}
	}

}