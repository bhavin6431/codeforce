import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String s[] = scan.nextLine().split(" ");
		int sec = Integer.parseInt(s[1]);
		String s1 = scan.nextLine();
		char c[] = s1.toCharArray();
		while (sec > 0) {
			for (int i = 0; i < s1.length() - 1; i++) {
				if (c[i] == 'B' && c[i + 1] == 'G') {
					char tmp = c[i];
					c[i] = c[i + 1];
					c[i + 1] = tmp;
					i++;
				}
			}
			sec--;
		}
		System.out.println(new String(c));
	}

}