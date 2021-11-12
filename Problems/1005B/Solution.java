import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s1 = bi.readLine();
		String s2 = bi.readLine();
		int i = 0;
		while (s1.length() - i > 0 && s2.length() - i > 0) {
			if (s1.charAt(s1.length() - i - 1) != s2.charAt(s2.length() - i - 1)) {
				break;
			}
			i++;
		}
		System.out.println(s2.length() - i + s1.length() - i);
	}
}