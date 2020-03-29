package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class N2588 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line1 = Integer.parseInt(br.readLine());
		int line2 = Integer.parseInt(br.readLine());
				
		System.out.println(line1*(line2%10));
		System.out.println(line1*(line2%100/10));
		System.out.println(line1*(line2/100));
		System.out.println(line1*line2);
		
	}
}
