package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N3052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] input = new int[10];
		for(int i=0;i<10;i++) {
			input[i]=Integer.parseInt(br.readLine())%42;
		}
		int same;
		int count =0;
		for(int i=0;i<10;i++) {
			same = 0;
			for(int j=i+1;j<10;j++) {
				if(input[i]==input[j])
					same++;
			}
			if(same==0)
				count++;
	
		
		}
		System.out.println(count);
	}
	
}
