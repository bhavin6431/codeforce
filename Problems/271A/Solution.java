import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();
		for (int i = Integer.parseInt(s) + 1; i <= 1000000; i++) {
			boolean flag = true;
			for (int j = 0; j < String.valueOf(i).length() - 1; j++) {
				for (int k = j + 1; k < String.valueOf(i).length(); k++) {
					if (String.valueOf(i).charAt(j) == String.valueOf(i).charAt(k)) {
						flag = false;
						break;
					}
				}
				if (!flag) {
					break;
				}
			}
			if (flag) {
				System.out.println(i);
				break;
			}
		}
	}
}