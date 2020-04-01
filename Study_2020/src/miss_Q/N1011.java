package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1011 {
	
	public static int cal(int x) {
		int result = 0;
	
		 int k= (int)Math.sqrt(x);
		 if(x!=k*k) {
		 if (x-k*k<=k) {
			 result = 2*k;
		 }else {
			 result = 2*k+1;
		 }
		 }else {
			 result = 2*k-1;
		 }	
		
		
		return result;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int qnum = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int A;
		int B;

		for(int i=0; i<qnum; i++) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			sb.append(cal(B-A)).append("\n");
		
		
		}
		System.out.println(sb);
	
	}
}
