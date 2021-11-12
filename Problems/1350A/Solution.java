import java.util.Arrays;
import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int x = 1000000;
		scan.nextLine();
		int p[] = new int[x + 2];
		Arrays.fill(p, 0);
		int i = 2;

		while (i * i <= x) {
			if (p[i] == 0) {
				int j = i * i;
				while (j <= x) {
					if (p[j] == 0) {
						p[j] = i;
					}
					j += i;
				}
			}
			i++;
		}

		while (t > 0)

		{

			String s[] = scan.nextLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int k = Integer.parseInt(s[1]);
			if (n % 2 == 0) {	
				System.out.println(n + (k * 2));
			} else {
				System.out.println(n + (p[n] == 0 ? n : p[n]) + ((k - 1) * 2));
			}
			t--;
		}
	}
}