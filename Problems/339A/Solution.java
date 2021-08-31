import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s[] = scan.nextLine().split("\\+");
		int f[] = new int[3];
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("1")) {
				f[0]++;
			}
			if (s[i].equals("2")) {
				f[1]++;
			}
			if (s[i].equals("3")) {
				f[2]++;
			}
		}
		int k = 0;
		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < f[i]; j++) {
				System.out.print(i + 1);
				k++;
				if (k != s.length) {
					System.out.print("+");
				}
			}
		}
	}

}