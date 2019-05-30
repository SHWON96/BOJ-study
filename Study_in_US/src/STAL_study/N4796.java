package STAL_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N4796 {
	public static int check(int L, int P, int V) {
		int result1 = (V/P)*L;
		int result2 = (V%P);
		if(V%P>L)
			result2 = L;
		return result1+result2;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;
		while(true) {
			String input = br.readLine();
			String test[] = new String[3];
			if(input.equals("0 0 0")) {
				break;
			}else {
				test = input.split(" ");
				System.out.println("Case "+i+": "+check(Integer.parseInt(test[0]),Integer.parseInt(test[1]),Integer.parseInt(test[2])));
				i++;
			}
				
		}
		
		
		
	}

}
