
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s[] = bi.readLine().split(" ");
		String s1[] = bi.readLine().split(" ");
		String s2[] = bi.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int a1[] = new int[n];
		int a2[] = new int[m];
		int f[] = new int[10];

		for (int i = 0; i < n; i++) {
			a1[i] = Integer.parseInt(s1[i]);
			f[a1[i]]++;
		}
		boolean common = false;
		int ans = 0;
		for (int i = 0; i < m; i++) {
			a2[i] = Integer.parseInt(s2[i]);
		}

		Arrays.sort(a1);
		Arrays.sort(a2);
		for (int i = 0; i < m; i++) {
			if (f[a2[i]] > 0) {
				common = true;
				ans = a2[i];
				break;
			}
		}

		if (common) {
			System.out.println(ans);
		} else {

			int i = 0;
			System.out.println(Math.min(a1[i], a2[i]) + "" + Math.max(a1[i], a2[i]));
		}
	}
}

