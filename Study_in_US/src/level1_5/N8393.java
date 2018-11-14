package level1_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N8393 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i=1 ; i<=num; i++)
			count +=i;
		
		System.out.println(count);
	}
	
}
