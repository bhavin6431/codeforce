import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t > 0) {
			String s[] = br.readLine().split(" ");
			int c = Integer.parseInt(s[2]);
			int r = Integer.parseInt(s[3]);

			int a = Math.min(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
			int b = Math.max(Integer.parseInt(s[0]), Integer.parseInt(s[1]));

			System.out.println(b - a - Math.max(Math.min(b, c + r) - Math.max(a, c - r), 0));

			t--;
		}
	}
}