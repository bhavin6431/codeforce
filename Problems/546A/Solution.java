import java.util.Arrays;
import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] s = scan.nextLine().split(" ");
		int start = Integer.parseInt(s[1]);
		int k = Integer.parseInt(s[0]);
		int w = Integer.parseInt(s[2]);
		int t = (w * (w + 1)) / 2;
		int need = t * k;
		System.out.println(start > need ? 0 : need - start);
	}

}