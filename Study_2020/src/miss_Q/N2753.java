package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2753 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		int result = 0;
		if(year%4 == 0 && year%100 != 0) {
			result = 1;
		}else if(year%400 == 0) {
			result = 1;
		}
		System.out.println(result);
	}
}
