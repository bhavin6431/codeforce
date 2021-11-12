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
			int n = Integer.parseInt(s[0]);
			int k = Integer.parseInt(s[1]);
			String s1 = bi.readLine();
			int l = 0;
			int r = n - 1;
			int c = 0;
			while (l < r) {
				if (s1.charAt(l) == s1.charAt(r)) {
					r--;
					l++;
					c++;
				} else {
					break;
				}
			}
			if (k == 0) {
				System.out.println("YES");
			} else {
				if (c >= k && (n - (k * 2)) > 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}

			t--;
		}
	}

}