package str;

import java.util.StringTokenizer;

public class StringWays {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder()
		.append("Name:Vivek;")
		.append("Age:30;")
		.append("Occupation:Software Developer;");

		StringTokenizer stringTokens = new StringTokenizer(sb.toString(),":;");

		while(stringTokens.hasMoreTokens()) {
			System.out.print(stringTokens.nextToken()+" ");
			System.out.println(stringTokens.nextToken());
		}

		int i = 0;
		System.out.println(((Integer)i).getClass().toString());
	}
}
