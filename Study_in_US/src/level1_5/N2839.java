package level1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2839 {

	public static int cal(int input) {
		int x = 0;
		int y = 0;
		// 3x+5y = input
		int min = 10000;
		
		for(int i=0 ;i<input/3+1;i++) {
			for(int j=0;j<input/5+1;j++)
				if(3*i+5*j == input)
					if(i+j < min)
						min = i+j;				
		}
		if(min ==10000)
			return -1;
		else
			return min;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		System.out.println(cal(a));
	}

}
