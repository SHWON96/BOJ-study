package STAL_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		long[] arr = new long[num+1];
		
		arr[0] = 1;
		if(num>1)
			arr[1] = 1;
		if(num>2)
			arr[2] = 2;
		
		// 1 1 2 3 5 8 13 21 34  
		// 1 --> 11
		// 2 --> 10
		// 3 --> 100 101
		// 4 --> 1000 1001 // 1010
		// 5 --> 10000 10001 10010 // 10100 10101
		// 6 --> 100000 100001 100010 // 100100 100101// 101000 101001 101010
		// 7 --> 1000000 1000001 1000010 1000100 // 1001000 1001001 1001010 // 1010000 1010001 1010010 1010100 1010101
		// 8 --> 10000000 10000001 10000010 10000100 10001000 10001001// 10010000 10010001 10010010 10010100 10010101 // 10100000 10100001 10100010 10100100 10101000 10101001 10101010
		for(int i = 3; i< num ;i++) {
			arr[i] = arr[i-1]+arr[i-2];	
		}
		
		System.out.println(arr[num-1]);
	}
}
