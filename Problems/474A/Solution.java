import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String s1 = scan.nextLine();

		String l1 = "qwertyuiop";
		String l2 = "asdfghjkl;";
		String l3 = "zxcvbnm,./";
		char ans[] = new char[s1.length()];
		int move = -1;
		if (s.equals("L")) {
			move = 1;
		}
		for (int i = 0; i < s1.length(); i++) {
			int indx = 0;
			if (l1.contains("" + s1.charAt(i))) {
				indx = l1.indexOf("" + s1.charAt(i));
				ans[i] = l1.charAt(indx + move);
			} else if (l2.contains("" + s1.charAt(i))) {
				indx = l2.indexOf("" + s1.charAt(i));
				ans[i] = l2.charAt(indx + move);
			} else {
				indx = l3.indexOf("" + s1.charAt(i));
				ans[i] = l3.charAt(indx + move);
			}

		}
		System.out.println(new String(ans));
	}

}