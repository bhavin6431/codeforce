import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);

		if (a == b) {
			System.out.println(a + "1" + " " + b + "2");
		} else if (a > b) {
			if (a == 9 && b == 1) {
				System.out.println(a + " " + b + "0");
			} else {
				System.out.println(-1);
			}
		} else {
			if (b - a > 1) {
				System.out.println(-1);
			} else {
				System.out.println(a + "9" + " " + b + "0");
			}
		}

	}
}