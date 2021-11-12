import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t > 0) {
			String s[] = br.readLine().split(" ");
			String s1[] = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);

			int c = Integer.parseInt(s1[0]);
			int d = Integer.parseInt(s1[1]);

			if ((a == c && b + d == a) || (a == d && b + c == a) || (b == c && a + d == c) || (b == d && a + c == d)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

			t--;
		}
	}
}