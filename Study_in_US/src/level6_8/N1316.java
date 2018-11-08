package baek_study;

import java.util.ArrayList;
import java.util.Scanner;

public class N1316 {

	public static String RInput(String input) {
		int ltest = input.length();
		ArrayList<Character> stest = new ArrayList<Character>();
		char[] arrtest = input.toCharArray();
		//char[] result = new char[ltest];
		int i = 0;
		int j = i+1;
		outer:while(i<ltest && j<ltest) {
			if(arrtest[i]!= arrtest[j]&&j<ltest){
				stest.add(arrtest[i]);
			}if(j==ltest-1){
				stest.add(arrtest[j]);
				break outer;
			}
			i = j;
			j = i+1;			
		}
		//System.out.println(stest);
		String result = "";
		for(Character s:stest)
				result+= s;
		//System.out.println(result);
		return result;
	}
	
	
	public static int checkstr(String result) {
		
		int inlen = result.length();
		ArrayList<Character> stest = new ArrayList<Character>();
		char[] restest = result.toCharArray();
		for(Character s: restest)
				stest.add(s);
		int i = 0;
		while(i<inlen-1) {
			for(int j = i+1; j<inlen;j++) {
				if(stest.get(i) == stest.get(j))
					return 0;
			}
			i++;
		}
		return 1;
		
	}
	
	public static void main(String[] args) {
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int num;
				
		num = sc.nextInt();
		String[] word = new String[num];
		
		for(int i = 0; i<num ; i++) {
			word[i] = sc.next();
		}
				
		for(int i = 0; i<num ; i++) {
			//System.out.println(checkstr(RInput(word[i])));
			count += checkstr(RInput(word[i]));
		}
		System.out.println(count);
			
		
	
		
				
	}
	
}
