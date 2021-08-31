import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s[] = bi.readLine().split(" ");
		int n = Integer.parseInt(bi.readLine());
		System.out.println(s[0] + " " + s[1]);
		for (int i = 0; i < n; i++) {
			String s1[] = bi.readLine().split(" ");
			if (s[0].equals(s1[0])) {
				s[0] = s1[1];
			} else if (s[1].equals(s1[0])) {
				s[1] = s1[1];
			}
			System.out.println(s[0] + " " + s[1]);
		}
	}
}

