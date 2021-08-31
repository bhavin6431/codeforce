import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String f = scan.nextLine();
		System.out.println(f.toLowerCase().substring(0, 1).toUpperCase() + f.substring(1, f.length()));
	}

}