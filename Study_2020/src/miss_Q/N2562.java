package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2562 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = new int[9];
		for(int i=0;i<9;i++) {
			input[i]=Integer.parseInt(br.readLine());
		}
		int max = input[0];
		int where = 0;
		for(int i=0;i<9;i++) {
			if(input[i]>=max) {
				max = input[i];
				where = i+1;
			}
		}
		System.out.println(max);
		System.out.println(where);
	}

}
