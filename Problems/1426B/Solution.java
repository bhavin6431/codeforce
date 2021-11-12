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
			long n = Integer.parseInt(s[0]);
			long m = Integer.parseInt(s[1]);
			int count1 = 0;
			for (int i = 0; i < n; i++) {
				String s1[] = bi.readLine().split(" ");
				String s2[] = bi.readLine().split(" ");

				if (s1[1].equals(s2[0])) {
					count1++;
				}
			}
			if (m < 2) {
				System.out.println("NO");
			} else if (count1 > 0) {
				if (m % 2 == 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}
			t--;
		}
	}
}