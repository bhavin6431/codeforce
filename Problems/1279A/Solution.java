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
			int max = 0;
			int maxIn = 0;
			for (int i = 0; i < s.length; i++) {
				if (max < Integer.parseInt(s[i])) {
					max = Integer.parseInt(s[i]);
					maxIn = i;
				}
			}
			int sum = 0;
			for (int i = 0; i < s.length; i++) {
				if (maxIn != i) {
					sum += Integer.parseInt(s[i]);
				}
			}

			System.out.println(sum >= (max - 1) ? "YES" : "NO");

			t--;
		}
	}
}