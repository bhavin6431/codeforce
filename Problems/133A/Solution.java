import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'H' || s.charAt(i) == 'Q' || s.charAt(i) == '9') {
				System.out.print("YES");
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("NO");
		}
	}
}