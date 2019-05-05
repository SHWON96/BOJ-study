package STAL_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N3085 {
	
	public static int check(char[][] input,int many) {
		int max;
		int[] maxcol = new int[many];
		int[] maxrow = new int[many];
		for(int i = 0; i<many; i++) {
			max = 1;
			for(int j=1;j<many;j++) {
			if(input[i][j-1]==input[i][j]) {
				max ++;
				if(max>maxcol[i])
					maxcol[i] = max;
			}else {
				max = 1;
			}
			}
			
			
		}
		for(int i = 0; i<many;i++) {
			max = 1;
			for(int j = 1 ; j< many; j++) {
				if(input[j-1][i]==input[j][i]) {
					max++;
					if(max>maxrow[i])
						maxrow[i] = max;
					
			}else {
					max = 1;
				}
			}
			
			
		}
		Arrays.sort(maxcol);
		Arrays.sort(maxrow);
		if(maxcol[many-1]>maxrow[many-1])
			return maxcol[many-1];
		else
			return maxrow[many-1];
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int many = Integer.parseInt(br.readLine());
		char candy[][] = new char[many][many];
		int maxcol[][] = new int[many][many];
		int maxrow[][] = new int[many][many];
		
		int maxncol = 0;
		int maxnrow = 0;
		
		// 값 입력
		for(int i=0; i<many;i++) {
			String input = br.readLine();
			for(int j=0;j<many;j++) {
				candy[i][j] = input.charAt(j);
			}
		}
		
		// 좌우&위아래 교환 후 체크
		for(int i = 0; i<many;i++) {
			for(int j = 1; j<many;j++){
				char temp = candy[i][j-1];
				candy[i][j-1] = candy[i][j];
				candy[i][j] = temp;
				maxcol[i][j-1]=check(candy,many);
				candy[i][j] = candy[i][j-1];
				candy[i][j-1] = temp;
				char temp1 =candy[j-1][i];
				candy[j-1][i] = candy[j][i];
				candy[j][i] = temp1;
				maxrow[i][j-1]=check(candy,many);
				candy[j][i] = candy[j-1][i];
				candy[j-1][i] = temp1;
				
			}
			Arrays.sort(maxcol[i]);
			Arrays.sort(maxrow[i]);
		}
		
		maxnrow = maxrow[0][many-1];
		maxncol = maxcol[0][many-1];
		for(int i = 1 ; i<many; i++) {			
			if(maxrow[i][many-1]>maxnrow)
				maxnrow = maxrow[i][many-1];
			if(maxcol[i][many-1]>maxncol)
				maxncol = maxcol[i][many-1];
		}
		
		
		if(maxnrow>maxncol)
			System.out.println(maxnrow);
		else
			System.out.println(maxncol);
		
	}

}
