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
			String s[] = bi.readLine().split(" ");
			int a[] = new int[s.length];
			for (int i = 0; i < s.length; i++) {
				a[i] = Integer.parseInt(s[i]);
			}
			Arrays.sort(a);
			System.out.println(Math.max(0, Math.abs(a[0] - a[1]) + Math.abs(a[1] - a[2]) + Math.abs(a[0] - a[2]) - 4));
			t--;
		}

	}
}