import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");

		boolean grZerofound = false;
		boolean zerofound = false;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (i != j) {
					for (int k = 0; k < s.length; k++) {
						if (i != j && j != k && i != k) {
							int a = (Integer.parseInt(s[i]));
							int b = (Integer.parseInt(s[j]));
							int c = (Integer.parseInt(s[k]));
							if (a + b > c && a + c > b && b + c > a) {
								grZerofound = true;
							}
							if (a + b == c || c + b == a || a + c == b) {
								zerofound = true;
							}
						}
					}
				}
			}
		}

		if (grZerofound) {
			System.out.println("TRIANGLE");
		} else if (zerofound) {
			System.out.println("SEGMENT");
		} else {
			System.out.println("IMPOSSIBLE");
		}

	}
}