import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		while (n > 0) {
			if (n - 100 >= 0) {
				n -= 100;
				count++;
				continue;
			}
			if (n - 20 >= 0) {
				n -= 20;
				count++;
				continue;
			}
			if (n - 10 >= 0) {
				n -= 10;
				count++;
				continue;
			}
			if (n - 5 >= 0) {
				n -= 5;
				count++;

				continue;
			}
			if (n - 1 >= 0) {
				n -= 1;
				count++;

				continue;
			}
		}
		System.out.println(count);
	}

}