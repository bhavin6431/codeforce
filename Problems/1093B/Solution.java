import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t > 0) {
			String s1 = br.readLine();
			int prev = s1.charAt(0);
			int f[] = new int[26];
			f[prev - 97]++;
			boolean goodString = false;

			for (int i = 1; i < s1.length(); i++) {
				if (prev != s1.charAt(i)) {
					goodString = true;
				}
				f[s1.charAt(i) - 97]++;
			}
			if (!goodString) {
				System.out.println("-1");
			} else {
				int len = 0;
				int start = 0;
				char c[] = new char[s1.length()];
				while (len < s1.length()) {
					if (f[start] > 0) {
						c[len] = (char) (start + 97);
						f[start]--;

					} else {
						start++;
						continue;
					}
					len++;
				}
				System.out.println(new String(c));

			}
			t--;
		}
	}
}