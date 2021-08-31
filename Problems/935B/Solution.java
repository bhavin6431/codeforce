import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bi.readLine());
		String s = bi.readLine();
		int ans = 0;
		int i = 1;
		if (n == 1) {
			System.out.println(0);
		} else {
			boolean down = s.charAt(0) == 'U' ? false : true;
			int x = down ? 1 : 0;
			int y = down ? 0 : 1;
			while (i <= n) {
				if (x > y && !down) {
					ans++;
					down = !down;
				} else if (x < y && down) {
					ans++;
					down = !down;
				}
				if (i < n) {
					if (s.charAt(i) == 'U') {
						y++;
					} else {
						x++;
					}
				}
				i++;
			}
			System.out.println(ans);
		}
	}
}

