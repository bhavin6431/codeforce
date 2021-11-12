import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		scan.nextLine();

		String s[] = scan.nextLine().split(" ");
		int[] a = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			a[i] = Integer.parseInt(s[i]);
		}

		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 0; i < a.length - 1; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] < a[j]) {
						int tmp = a[i];
						a[i] = a[j];
						a[j] = tmp;
						swap = true;
					}
				}
			}
		}

		int c = 0;
		boolean found = true;
		while (m > 0) {
			if (c > a.length - 1) {
				found = false;
				break;
			}
			m -= a[c];
			c++;
		}
		System.out.println(found ? c : -1);
	}

}