package STAL_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class N10448 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int many = Integer.parseInt(br.readLine());
		int test[] = new int[44];
		for( int i = 1; i<45; i++) {
			test[i-1] = i*(i+1)/2;
		}
		
		
		for(int t = 0; t<many;t++) {
			int result = 0;
		int find = Integer.parseInt(br.readLine());
		
		for(int j=0;j<44;j++) {
			for(int k=0;k<44;k++) {
				for(int e=0;e<44;e++) {
					if(test[j]+test[k]+test[e]==find) {
						result = 1;
						break;
					}
				}
			}
		}
		System.out.println(result);
		}
		
	}

}
