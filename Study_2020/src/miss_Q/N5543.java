package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N5543 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] menu = new int[5];
		
		
		for(int i=0; i<5; i++) {
			menu[i] = Integer.parseInt(br.readLine());
		}
		int minbug = menu[0];
		int mindrink = menu[3];
		if(minbug>=menu[1]) {
			minbug = menu[1];
		}if(minbug>=menu[2]) {
			minbug = menu[2];
		}if(mindrink>=menu[4]) {
			mindrink = menu[4];
		}
		System.out.println(minbug+mindrink-50);
	
	}

}
