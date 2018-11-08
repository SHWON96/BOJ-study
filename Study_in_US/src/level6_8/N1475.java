package baek_study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N1475 {
	
	public static int check(char[] row) {
		int[] num = new int[10];		
		
		for(int i = 0; i<row.length;i++) {
			
		switch(row[i]) {
		case '0':
			num[0]++;
			continue;
		case '1':
			num[1]++;
			continue;
		case '2':
			num[2]++;
			continue;
		case '3':
			num[3]++;
			continue;
		case '4':
			num[4]++;
			continue;
		case '5':
			num[5]++;
			continue;
		case '6':
			num[6]++;
			continue;
		case '7':
			num[7]++;
			continue;
		case '8':
			num[8]++;
			continue;
		case '9':
			num[9]++;
			continue;
			}
		}
		
		if(num[6] != num[9])
			num[6] = (num[9] + num[6]+1)/2;
		
		int max = num[0];
		for(int i = 0; i<num.length-1;i++) {
			if(num[i] > max)
				max = num[i];
		}
		
		return max;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String roomN = br.readLine();
		char[] rN = new char[roomN.length()];
		
		for(int i = 0; i<roomN.length();i++) {
			rN[i] = roomN.charAt(i);			
		}
		
		System.out.println(check(rN));
		
		//111222333 --> 3¼¼Æ®
		
		
		
	}
}
