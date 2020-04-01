package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2869 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		/* 2 - 1 + 2 - 1 + 2 -1 + 2
		 * 
		 * 
		 * 10 이라고 가정 4 , 1
		 * 4 - 1 + 4 - 1 + 4 끝
		 * 4 - 2 + 4 - 2 + 4 - 2 + 4
		 * V < (A-B)x + A --> x+1 일
		 * V-A <= (A-B)x
		 * V-A/A-B 
 		 * 
 		 * A
		 * */
		int sub = A-B;
		int answer = 1;
		V = V-A;
		int day = V/sub;
		
		
		if(V-day*sub<=0) {
			answer = answer + day;
		}else {
			answer = answer + day +1;
		}
		System.out.println(answer);
		
	}
}
