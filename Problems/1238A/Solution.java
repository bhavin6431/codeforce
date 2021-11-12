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
			if (Long.parseLong(s[0]) - Long.parseLong(s[1]) == 1) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
			t--;
		}
	}

}