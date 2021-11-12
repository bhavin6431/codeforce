import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		Integer n = Integer.parseInt(bi.readLine());
		String s = bi.readLine();
		if (s.length() < 3) {
			System.out.println(s);
		} else {
			char ans[] = new char[n];
			int l = 0;
			int r = 0;
			if (n % 2 != 0) {
				ans[n / 2] = s.charAt(0);
			}
			l = (n / 2) - 1;
			if (n % 2 == 0) {
				r = (n / 2);
			} else {
				r = (n / 2) + 1;
			}
			int i = 1;
			if(n % 2 ==0) {
				i = 0;
			}
			while (l >= 0) {
				ans[l--] = s.charAt(i++);
				ans[r++] = s.charAt(i++);
			}
			System.out.println(new String(ans));
		}
	}
}