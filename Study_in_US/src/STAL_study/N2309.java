package STAL_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class N2309 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> ls = new LinkedList<Integer>();
		
		int sum = 0;
		for(int i = 0 ; i<9;i++) {
			ls.add(Integer.parseInt(br.readLine()));
			sum += ls.get(i);
		}
		sum = sum-100;
		
	outer:	for (int i=1; i<9; i++) {
			for(int j=0; j<i; j++) {
				int result = sum-ls.get(i)-ls.get(j);
				if(result==0) {
					ls.remove(i); 
					ls.remove(j);
					break outer;
				}
			}
		}
		ls.sort(null);
		for(int i = 0 ; i<7; i++)
			System.out.println(ls.get(i));
		
	}

	

}
