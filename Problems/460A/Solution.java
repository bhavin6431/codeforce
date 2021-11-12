import java.util.Scanner;

public final class Solution {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		String s[] = scan.nextLine().split(" ");

		int socs = Integer.parseInt(s[0]);
		int d = Integer.parseInt(s[1]);
		int i = 1;
		while (socs > 0) {
			if (i % d == 0) {
				socs++;
			}
			socs--;
			i++;
		}
		System.out.println(i - 1);
	}
}