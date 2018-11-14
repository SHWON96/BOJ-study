package level1_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N2441 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<num; i++) {
			for(int k=0; k<i ; k++) {
				sb.append(" ");
			}
			for(int j=num; j>i;j--) {
			sb.append("*");
			}
			sb.append("\n");
			
		}System.out.println(sb);
	}
}
