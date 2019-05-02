package STAL_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class N1966 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine()); // @1
		while(testcase-- != 0) {
			String[] input = br.readLine().split(" ");
			String[] priority_str = br.readLine().split(" ");
			
			// @2
			int n = Integer.parseInt(input[0]);
			int m = Integer.parseInt(input[1]) + 1;
			LinkedList<Integer> priority = new LinkedList<Integer>();
			for(int i=0; i<n; i++) 
				priority.add(Integer.parseInt(priority_str[i]));
			
			int cnt = 0;
			
			// @3
			Queue<Integer> Q = new LinkedList<Integer>();
			for(int i=0; i<n; i++) Q.offer(i+1);
			
			boolean isMax; // @4
			for(int i=0; !Q.isEmpty(); ) { // @5
				isMax = true;
				for(int j=i; j<Q.size(); j++) { // @6
					if(priority.get(i) < priority.get(j)) {
						int tmp = priority.poll();
						priority.offer(tmp);
						tmp = Q.poll();
						Q.offer(tmp);
						
						isMax = false;
						break;
					}
				}
				
				// @7
				if(isMax) {
					cnt++;
					priority.poll();
					int check = Q.poll();
					if(check == m) {
						System.out.println(cnt);
						break;
					}
				}
			}
		}
	}
}

/*
public class N1966 {	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int max;
		int check;
		String put;
		String[] input1;
		String[] input2;
		Queue<Integer> que = new LinkedList<>();
		
		for(int i = 0; i<num;i++) {
			put = br.readLine();
			input1 = put.split(" ");
			int[] arr = new int[Integer.parseInt(input1[0])];			
			put = br.readLine();
			input2 = put.split(" ");
			
			for(int j = 0; j<input2.length; j++) {
				que.add(Integer.parseInt(input2[j]));
				arr[j] = Integer.parseInt(input2[j]);
			}
			int checker = arr[Integer.parseInt(input1[1])]; // 내가 확인할 숫자
			
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			max = arr[arr.length-1];
			System.out.println(max);
			
			int temp = 0;
			for(int k = 0; k<arr.length-1;k++) {
				if(que.peek()==max) {
					que.poll();
				}else if(que.peek()>checker){
					
				}else{
					temp++;
				}
			}
			
					
			int temp = 0;
			for(int k=0;k<arr.length-1;k++) {
				if(que.peek()==max) {
					break;
				}else {
					temp++;
				}
			}
			System.out.println(temp);
			
		}
	}

} 
*/
