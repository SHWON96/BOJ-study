package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11022 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int casenum = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<casenum; i++) {
		String[] num = br.readLine().split(" ");
		sb.append("Case #");
		sb.append(i+1);
		sb.append(": ");
		sb.append(num[0]+" + "+num[1]+" = ");
		sb.append(Integer.parseInt(num[0])+Integer.parseInt(num[1]));		
		sb.append("\n");
		}
		System.out.println(sb);
	}
}
