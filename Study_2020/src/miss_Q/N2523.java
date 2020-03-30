package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2523 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int max = Integer.parseInt(br.readLine());
		
		
		for(int i=1; i<=max; i++) {
			for(int j=0; j<i;j++) {
				//System.out.print("*");\
				sb.append("*");
				}
			//System.out.println();
			sb.append("\n");
		}
		for(int i=max-1; i>0;i--) {
			for(int j=i; j>0;j--) {
				//System.out.print("*");
				sb.append("*");
				}
			//System.out.println();
			sb.append("\n");
		}
		System.out.println(sb);
		}
	}


