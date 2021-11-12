import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while (t > 0)

		{
			int n = scan.nextInt();
			scan.nextLine();
			String s[] = scan.nextLine().split(" ");
			int a[] = new int[n];
			int max = 0;
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(s[i]);
				max = Math.max(max, a[i]);
			}
			boolean found = true;
			for (int i = 0; i < n; i++) {
				if((max - a[i]) % 2 !=0 ) {
					found = false;
					break;
				}
			}
			if(found) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			t--;
		}
	}
}