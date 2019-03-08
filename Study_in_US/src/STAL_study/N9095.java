package STAL_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9095 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int sample;
		
		for(int i = 0; i<num; i++) {
			sample = Integer.parseInt(br.readLine());
			System.out.println(resul(sample));
		}
	}
	
	public static int resul(int input) {
		int[] arr = new int[input+1];
		if(input>3) {
			int sum = 1;
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
		for(int i = 3; i<=input; i++) {
			arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
		}
		
		for(int i = 0;i<input-1;i++) {
			sum = sum + arr[i];
		}
			return sum;
		}else if(input==3) {
			return 4;
		}else if(input==2) {
			return 2;
		}else if(input==1) {
			return 1;
		}else {
			return 0;
		}
		}
	}


