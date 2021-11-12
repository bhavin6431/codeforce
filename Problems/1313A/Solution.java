import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bi.readLine());
		while (n > 0) {
			String s[] = bi.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2]);
			int ans = 0;
			if (a > 0) {
				a--;
				ans++;
			}
			if (b > 0) {
				b--;
				ans++;
			}
			if (c > 0) {
				c--;
				ans++;
			}

			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(a);
			arr.add(b);
			arr.add(c);
			Collections.sort(arr, Collections.reverseOrder());

			a = arr.get(0);
			b = arr.get(1);
			c = arr.get(2);

			if (a > 0 && b > 0) {
				a--;
				b--;
				ans++;
			}
			if (a > 0 && c > 0) {
				a--;
				c--;
				ans++;
			}
			if (b > 0 && c > 0) {
				b--;
				c--;
				ans++;
			}

			if (a > 0 && b > 0 && c > 0) {
				a--;
				b--;
				c--;
				ans++;
			}

			System.out.println(ans);
			n--;
		}
	}

}