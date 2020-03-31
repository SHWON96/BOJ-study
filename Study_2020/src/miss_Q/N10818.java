package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10818 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] input = new int[num];
		
		for(int i=0;i<num;i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = input[0];
		int max = input[0];
		
		for(int i=0;i<num;i++) {
			if(input[i]<=min) {
				min = input[i];
			}if(input[i]>=max) {
				max = input[i];
			}
		}
		sb.append(min).append(" ").append(max);
		System.out.println(sb);
	
	
	}
}
