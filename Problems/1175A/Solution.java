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
			long a = Long.parseLong(s[0]);
			long b = Long.parseLong(s[1]);
			long c = 0;

			while (a != 0) {
				if (a % b == 0) {
					a /= b;
					c++;
				} else {
					long m = a % b;
					a -= m;
					c += m;
				}

			}
			System.out.println(c);

			t--;
		}
	}
}