import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bi.readLine());
		String s[] = bi.readLine().split(" ");
		int st = 0;
		int ed = n - 1;
		boolean swap = true;
		while (st < ed) {
			if (swap) {
				String tmp = s[st];
				s[st] = s[ed];
				s[ed] = tmp;
			}
			swap = !swap;
			st++;
			ed--;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(s[i] + " ");
		}
	}
}