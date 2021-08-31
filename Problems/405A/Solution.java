import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String s[] = scan.nextLine().split(" ");
		int ans[] = new int[n];
		for (int i = 0; i < n; i++) {
			ans[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(ans);
		for (int i = 0; i < n; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}