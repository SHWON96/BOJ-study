package level1_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N1008 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		double a = (double) Character.getNumericValue(s.charAt(0));
		double b = (double) Character.getNumericValue(s.charAt(2));
		System.out.println(a/b);

	}

}
