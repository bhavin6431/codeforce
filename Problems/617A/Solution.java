import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int step = 0;
		while (n > 0) {
			if (n - 5 >= 0) {
				n = n - 5;
			} else if (n - 4 >= 0) {
				n = n - 4;
			} else if (n - 3 >= 0) {
				n = n - 3;
			} else if (n - 2 >= 0) {
				n = n - 2;
			} else if (n - 1 >= 0) {
				n = n - 1;
			}
			step++;
		}
		System.out.println(step);
	}

}