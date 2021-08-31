import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scan.nextInt();
		scan.nextLine();
		int[] a = Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		int m = scan.nextInt();
		scan.nextLine();
		int[] b = Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		int max = 0;
		int c = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (b[j] % a[i] == 0) {
					if (max < b[j] / a[i]) {
						max = b[j] / a[i];
						c = 1;
					} else if (max == b[j] / a[i]) {
						c++;
					}
				}
			}
		}
		System.out.println(c);
	}
}

