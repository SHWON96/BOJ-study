package baek_study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N2292 {
	
	// 지나가는 껍질 수 + 1 구하기
	// 1
	// 1 * 6 = 6	2-7	
	// 2 * 6 = 12	8-19
	// 3 * 6 = 18	20-37

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());	
		
		int count = 1;
		num = num-1;
		
		
		for(int i = 0; i<18260; i++){
			num = num - i*6;
			if(num <= 0)
				break;
			else
				count++;
			}
		
		System.out.println(count);
	}
	
}
