import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s[] = bi.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int a = Integer.parseInt(s[1]);
		int x = Integer.parseInt(s[2]);
		int b = Integer.parseInt(s[3]);
		int y = Integer.parseInt(s[4]);
		boolean found = false;
		while (a != x && b != y) {
			if (a == b) {
				found = true;
				break;
			}
			
		
			if (a + 1 > n ) {
				a = 1;
			} else {
				a++;	
			}
			if (b - 1 < 1) {
				b = n;
			} else {
				b--;
			}
		}
		if (found) {
			System.out.println("YES");
		} else {
			if (a == b) {
				System.out.println("YES");

			} else {
				System.out.println("NO");
			}
		}
	}
}

