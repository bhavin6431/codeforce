import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bi.readLine());
		int max = 0;
		while (t > 0) {
			String s[] = bi.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			max = Math.max(max, x + y);
			t--;
		}
		System.out.println(max);
	}
}