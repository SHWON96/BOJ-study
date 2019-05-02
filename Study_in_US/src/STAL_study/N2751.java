package STAL_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N2751 {
	
	public static void checklst(int[] lst) {
		int len = lst.length;
		int[] rilst = Arrays. copyOfRange(lst, 0, (len+1)/2);
		int[] lelst = Arrays. copyOfRange(lst, (len+1)/2, len);
		int[] retmp = new int[rilst.length];
		int[] letmp = new int[lelst.length];
		int rilen = rilst.length;
		int lelen = lelst.length;
		
		for(int i=0;i<rilen;i++) {
			
		}
		
		checklst(lst);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] lst = new int[num];
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<num; i++) {
			lst[i] = Integer.parseInt(br.readLine());
		}
		
		int[] rilst = Arrays. copyOfRange(lst, 0, (num+1)/2);
		int[] lelst = Arrays. copyOfRange(lst, (num+1)/2, num);
		
		
	
		
		int i = 0;  int j = 0;
		
		while(i+j==num) {
			if(rilst[i]<lelst[j]) {
				sb.append(rilst[i]);
				i++;
			}else{
				sb.append(lelst[j]);
				j++;
			}
			
		}
		
		
		
		
	}

}
