import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		String s1[] = br.readLine().split(" ");
		int b = Integer.parseInt(s[0]);
		int numOdd = 0;
		int numeven = 0;
		for (int i = 0; i < s1.length; i++) {
			if (Integer.parseInt(s1[i]) % 2 != 0 && Integer.parseInt(s1[i]) != 0) {
				numOdd++;
			} else {
				numeven++;
			}
		}
		if (b % 2 == 0) {
			if (Integer.parseInt(s1[s1.length - 1]) % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		} else {
			if (numOdd % 2 != 0) {
				System.out.println("odd");
			} else {
				System.out.println("even");
			}

		}
	}
}