import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		String s[] = bi.readLine().split(" ");
		Integer n = Integer.parseInt(s[0]);
		Integer k = Integer.parseInt(s[1]);
		String s1 = bi.readLine();
		int f[] = new int[26];
		for (int i = 0; i < n; i++) {
			f[s1.charAt(i) - 97]++;

		}

		int indx = 0;
		int ans = 0;
		while (k > 0 && indx < 26) {
			if (f[indx] > 0) {
				k--;
				ans += indx + 1;
				indx += 2;
			} else {
				indx++;
			}
		}
		System.out.println(k > 0 ? -1 : ans);
	}

}