import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bi.readLine());
		while (t > 0) {
			StringBuilder sb = new StringBuilder();

			int n = Integer.parseInt(bi.readLine());
			if (n % 2 == 0) {
				while (n > 0) {
					sb.append('1');
					n -= 2;
				}
				System.out.println(sb.toString());
			} else {
				while (n > 3) {
					sb.append('1');
					n -= 2;
				}
				System.out.println("7" + sb.toString());
			}
			t--;
		}
	}
}