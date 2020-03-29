package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10950 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int casenum = Integer.parseInt(br.readLine());
		for (int i=0; i<casenum; i++) {
		String[] num = br.readLine().split(" ");
		System.out.println(Integer.parseInt(num[0])+Integer.parseInt(num[1]));		
		}
		
	}
}
