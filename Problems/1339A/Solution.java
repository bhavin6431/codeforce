import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while (t > 0) {
			int n = scan.nextInt();
			scan.nextLine();
			System.out.println(n);
			t--;
		}
	}

}