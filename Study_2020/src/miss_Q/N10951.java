package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10951 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str ;
		while(true) {		
			str = br.readLine();
			if(str ==null) {
				break;
			}else {
			String[] input = str.split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
				sb.append(a+b);
				sb.append("\n");
	
			}			
			
	}
		System.out.println(sb);
	}
}
