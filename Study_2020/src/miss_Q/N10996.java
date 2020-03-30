package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10996 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int max = Integer.parseInt(br.readLine());
		/*
		 * a //n
		 *   // n-1
		 * 2 
		 * a // n-1
		 * ba // n
		 * 
		 * 3
		 * aba //n
		 * ba  //n-1
		 * 
		 * 4
		 * aba //n-1
		 * baba //n
		 * 
		 * 5
		 * ababa
		 * baba
		 * */
		if(max %2==1) {
		// 1
		for(int i=max; i>0;i--) {
			if(i%2==0) {
				sb.append(" ");
			}else {
				sb.append("*");
			}
		}
		sb.append("\n");
		// 2
		for(int i=max-1; i>0;i--) {
			if(i%2==0) {
				sb.append(" ");
			}else {
				sb.append("*");
			}
		}
		}else {
			for(int i=max-1; i>0;i--) {
				if(i%2==0) {
					sb.append(" ");
				}else {
					sb.append("*");
				}
			}
			sb.append("\n");
			for(int i=max; i>0;i--) {
				if(i%2==0) {
					sb.append(" ");
				}else {
					sb.append("*");
				}
			}
		}
		for(int i=0;i<max;i++)
			System.out.println(sb);
		
	}
}
