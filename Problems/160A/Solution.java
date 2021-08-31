import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String s[] = scan.nextLine().split(" ");
		int v[] = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			v[i] = Integer.parseInt(s[i]);
			sum += v[i];
		}
		int target = (sum / 2) + 1;
		Arrays.sort(v);
		int take = 0;
		int i = n - 1;
		int count = 0;
		do {
			take += v[i];
			i--;
			count++;
		} while (take < target);
		System.out.print(count);
	}
}