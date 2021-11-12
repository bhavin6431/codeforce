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
			String s1[] = bi.readLine().split(" ");

			int m = (int) Math.ceil((double) n / 2);
			int indx = (m - 1) * k;
			long sum = 0;
			long skip = n - m + 1;

			while (k > 0) {
				sum += Integer.parseInt(s1[indx]);
				indx += skip;
				k--;
			}
			System.out.println(sum);
			t--;
		}
	}
}