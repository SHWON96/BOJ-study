package STAL_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class N9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder("");
	outer:	for(int i = 0; i<num; i++) {
			String str = br.readLine();
			if(str.charAt(0)==')' || str.charAt(str.length()-1)=='(') {
				sb.append("NO\n");
				continue;
			}
			int left = 0;
			int right = 0;
			
			for(int j = 0; j<str.length();j++) {
				if(str.charAt(j)=='(')
					left ++;
				else if(str.charAt(j)==')')
					right++;
				if(left<right) {
					sb.append("NO\n");
					continue outer;
				}
			}
			if(left!=right) {
				sb.append("NO\n");
			}else {
				sb.append("YES\n");
				
			}
			
	}
		System.out.println(sb);
	}
}
