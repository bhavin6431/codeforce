import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		// int n = scan.nextInt();
		// scan.nextLine();
		int[] a = Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		// int m = scan.nextInt();
		// scan.nextLine();
		int c = 0;
		int[] b = Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		for (int i = 0; i < a[0]; i++) {
			if (b[i] == 1) {
				if (a[1] > 0) {
					a[1]--;
				} else {
					c++;
				}
			} else {
				if (a[2] > 0) {
					a[2]--;
				} else if (a[1] > 0) {
					a[1]--;
				} else {
					c++;
				}
			}
		}
		System.out.println(c);
	}
}

