import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s[] = bi.readLine().split(" ");
		int m = cal(Integer.parseInt(s[0]), Integer.parseInt(s[2]));
		int n = cal(Integer.parseInt(s[1]), Integer.parseInt(s[3]));
		if (m > n) {
			System.out.println("Misha");
		} else if (n > m) {
			System.out.println("Vasya");
		} else {
			System.out.println("Tie");
		}
	}

	static int cal(int p, int t) {
		return Math.max((3 * p) / 10, p - ((p / 250) * t));
	}
}