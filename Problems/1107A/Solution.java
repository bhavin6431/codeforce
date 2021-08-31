import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bi.readLine());

		while (t > 0) {
			int n = Integer.parseInt(bi.readLine());
			String s = bi.readLine();
			if (n == 2 && Long.parseLong(s.charAt(0) + "") >= Long.parseLong(s.charAt(1) + "")) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
				System.out.println("2");
				System.out.println(s.charAt(0) + " " + s.substring(1, s.length()));
			}
			t--;
		}
	}

}