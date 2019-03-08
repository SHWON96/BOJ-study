package STAL_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2747 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num+2];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 0; i< num ; i++) {
			arr[i+2] = arr[i]+arr[i+1];
		}
		
		System.out.println(arr[num]);
	}

}
