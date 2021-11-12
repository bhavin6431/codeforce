import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.nextLine();
		String s = scan.nextLine();
		Map<String, Integer> map = new HashMap();
		String ans = "";
		int max = 0;
		for (int i = 0; i < n - 1; i++) {
			String str = s.charAt(i) + "" + s.charAt(i + 1);
			if (map.containsKey(str)) {
				int val = map.get(str);
				if (max < val + 1) {
					max = val + 1;
					ans = str;
				}
				map.put(str, val + 1);
			} else {
				map.put(str, 1);
				if (max < 1) {
					max = 1;
					ans = str;
				}
			}
		}
		System.out.println(ans);
	}
}