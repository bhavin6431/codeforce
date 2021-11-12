import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		Map<String, Integer> map = new HashMap();
		map.put("q", 9);
		map.put("r", 5);
		map.put("b", 3);
		map.put("n", 3);
		map.put("p", 1);

		Map<String, Integer> map1 = new HashMap();
		map1.put("Q", 9);
		map1.put("R", 5);
		map1.put("B", 3);
		map1.put("N", 3);
		map1.put("P", 1);

		int cw = 0;
		int cb = 0;
		for (int i = 0; i < 8; i++) {
			String s = bi.readLine();
			for (int j = 0; j < s.length(); j++) {
				String val = s.charAt(j) + "";
				if (map.containsKey(val)) {
					cb += map.get(val);
				} else if (map1.containsKey(val)) {

					cw += map1.get(val);
				}
			}
		}
		if (cb > cw) {
			System.out.println("Black");
		} else if (cw > cb) {
			System.out.println("White");
		} else {
			System.out.println("Draw");
		}
	}

}