import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Integer n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int f[] = new int[26];
		boolean found = false;
		for (int i = 0; i < n; i++) {
			f[s.charAt(i) - 97]++;
			if (f[s.charAt(i) - 97] > 1) {
				found = true;
				break;
			}
		}
		System.out.println(found || s.length() == 1 ? "YES" : "NO");

	}

}