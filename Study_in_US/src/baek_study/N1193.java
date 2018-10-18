package baek_study;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class N1193 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int input=Integer.parseInt(br.readLine());
		int count = 0;
		int line = 0;
		for(int i = 1 ; i< 4500; i++) {
			count += i;
			if(input<=count) {
				line = i;
				break;}
		}
		int test = 0;
		for(int i =1; i<line;i++)
			test += i;
		
		System.out.println(line);
		System.out.println(test);
		
		int right = input - test;
		int left = line - right +1;
		
		if(line%2 == 1) {
		System.out.println(left +"/"+right);
		}else {
			System.out.println(right+"/"+left);
		}
	}

}
