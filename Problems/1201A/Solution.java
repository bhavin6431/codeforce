import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int total = 0;
		String s1[] = new String[n];
		for (int i = 0; i < n; i++) {
			s1[i] = br.readLine();
		}
		String s2[] = br.readLine().split(" ");

		for (int i = 0; i < m; i++) {
			int max = 0;
			int f[] = new int[5];
			for (int j = 0; j < n; j++) {
				f[s1[j].charAt(i) - 65]++;
				max = Math.max(max, f[s1[j].charAt(i) - 65]);
			}
			total += max * Integer.parseInt(s2[i]);
		}
		System.out.println(total);
	}
}