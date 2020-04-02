package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11729 {
	
	public static StringBuilder hanoi(int n, int from, int by, int to, StringBuilder sb) {
	if(n==1) {
		sb.append(from+" "+to+"\n");
		return sb;
	}else {
		hanoi(n-1,from,to,by,sb);
		sb.append(from+" "+to+"\n");
		hanoi(n-1,by,from,to,sb);
	}
	return sb;
	
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nums = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int k = (int) Math.pow(2.0, nums);
		System.out.println(k-1);
	
		StringBuilder result =	hanoi(nums,1,2,3,sb); 
		System.out.println(sb);
		
	}
}
