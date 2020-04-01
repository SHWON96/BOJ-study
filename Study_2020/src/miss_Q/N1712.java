package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1712 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int breakpoint = 1;
		
		int profit = C-B;
		if(profit>0) {
		while(profit*breakpoint<=A) {
			
				breakpoint++;
			}
		System.out.println(A/profit +1);
		//System.out.println(breakpoint);
		}else {
			System.out.println(-1);
		}
		
		

	}
}
