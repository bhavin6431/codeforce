import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String s = scan.nextLine();
		Stack<Character> st = new Stack();

		for (int i = 0; i < s.length(); i++) {
			if (!st.isEmpty() && st.peek() != s.charAt(i)) {
				st.pop();
			} else {
				st.push(s.charAt(i));
			}
		}

		System.out.println(st.size());
	}
}