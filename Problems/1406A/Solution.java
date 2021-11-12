import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bi.readLine());
		while (t > 0) {
			int n = Integer.parseInt(bi.readLine());
			String[] s2 = bi.readLine().split(" ");
			int a[] = new int[n];
			int f[] = new int[105];
			Arrays.fill(f, 0);
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(s2[i]);
				f[a[i]]++;
			}
			int a1 = -1;
			for (int i = 0; i <=105; i++) {
				if (f[i] > 0) {
					f[i]--;
				} else {
					a1 = i;
					break;
				}
			}
			int b = -1;
			for (int i = 0; i <=105; i++) {
				if (f[i] > 0) {
					f[i]--;
				} else {
					b = i;
					break;
				}
			}

			System.out.println(a1 + b);

			t--;
		}
	}

}