package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10872 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Testcase = Integer.parseInt(br.readLine());
		
		int temp = 1;
		
		for(int i= Testcase; i>0; i--) {
			temp = temp*i;
		}
		System.out.println(temp);

		 
	}

}
