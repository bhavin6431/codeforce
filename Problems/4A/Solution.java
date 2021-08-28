import java.util.Scanner;
 
/*package whatever //do not write package name here */
 
public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
 
		System.out.println(t > 2 && t % 2 == 0 ? "YES" : "NO");
 
	}
 
}