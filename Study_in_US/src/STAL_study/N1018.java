package STAL_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N1018 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String checksum[][] = new String[8][8];
		String checksum1[][] = new String[8][8];
		
		for(int i = 0 ; i<8; i++) {
			for(int j = 0 ; j<8 ; j++) {
				if(i%2==0) {
					if(j%2==0) {
						checksum[i][j] = "W";
						checksum1[i][j] = "B";
					}else {
						checksum[i][j] = "B";
						checksum1[i][j] = "W";
					}
				}else { 
					if(j%2==1){
						checksum[i][j] = "W";
						checksum1[i][j] = "B";
				}else {
						checksum[i][j] = "B";
						checksum1[i][j] = "W";
				}			}			}		}
		
		int n1, n2;
		String input = br.readLine();
		n1 = Integer.parseInt(input.split(" ")[0]);
		n2 = Integer.parseInt(input.split(" ")[1]);
		String checks[][] = new String[n1][n2];
		int same1[][] =new int[n1-7][n2-7];
		int same2[][] =new int[n1-7][n2-7];
		
		String testset[][] = new String[n1][n2];
		for(int i=0;i<n1;i++) {
				testset[i] = br.readLine().split("");
		}
		
		for(int i = 0 ; i < n1-7 ; i++) {
			for(int j = 0 ;j<n2-7;j++) {
				for(int k = 0; k<8;k++) {
					for(int t = 0; t<8; t++) {
					if(testset[i+k][j+t].equals(checksum[k][t]))
						same1[i][j]++;
					if(testset[i+k][j+t].equals(checksum1[k][t]))
						same2[i][j]++;
				}
					}
			}
		}
		
		int min1 = same1[0][0];
		int min2 = same2[0][0];
		int max1 = same1[0][0];
		int max2 = same2[0][0]; 
		for(int i = 0 ; i < n1-7;i++) {
			for(int j = 0 ; j<n2-7;j++) {
				if(same1[i][j]<min1)
					min1 = same1[i][j];
				if(same1[i][j]>max1)
					max1 = same1[i][j];
				if(same2[i][j]<min2)
					min2 = same1[i][j];
				if(same2[i][j]>min2)
					max2 = same1[i][j];
			}
		}
		
		max1 = 64-max1;
		max2 = 64-max2;
		
		int last[] = new int[]{min1,min2,max1,max2};
		Arrays.sort(last);
		System.out.println(last[0]);
		
	}
		}
