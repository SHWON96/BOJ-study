package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2446 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int max = Integer.parseInt(br.readLine());
		for(int i=max; i>0; i--) {
			for(int t=i; t<max;t++) {
					sb.append(" ");
			}
			for(int j=2*i-1; j>0;j--) {
				//System.out.print("*");\
				sb.append("*");
				}
			//System.out.println();
			sb.append("\n");
			
		}
		for(int i=2; i<=max; i++) {
			for(int t=max-i; t>0;t--) {
				sb.append(" ");
				}
			for(int j=2*i-1; j>0;j--) {
				//System.out.print("*");\
				sb.append("*");
				}
			//System.out.println();
			sb.append("\n");
			
		}
		System.out.println(sb);
	}

}
