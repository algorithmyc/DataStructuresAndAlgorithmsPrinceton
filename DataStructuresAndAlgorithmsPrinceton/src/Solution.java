// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class Solution {

	public static int solution(int N) {

		int zeroCount = 0;
		int maxCount = 0;
		String toBinaryString = Integer.toBinaryString(N);

		String[] str = toBinaryString.split("");

		for (int i = 0; i < str.length - 1; i++) {
			if (str[i + 1].equals("0")) {
				zeroCount++;
			} else {
				if (str[i].equals("0")) {
					if (zeroCount > maxCount) {
						maxCount = zeroCount;
					}
					zeroCount = 0;
				}
			}
		}

		return maxCount;
	}

	public static void main(String[] args) {
		System.out.println(solution(1041));

	}

}