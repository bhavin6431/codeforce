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
			s = bi.readLine().split(" ");
			int min = Integer.MAX_VALUE;
			int max = 0;
			for (int i = 0; i < n; i++) {
				min = Math.min(Integer.parseInt(s[i]), min);
				max = Math.max(Integer.parseInt(s[i]), max);
			}
			if (max - k <= min + k) {
				System.out.println(min + k);
			} else {
				System.out.println(-1);
			}
			t--;
		}
	}
}