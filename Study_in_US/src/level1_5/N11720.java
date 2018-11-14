package level1_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N11720 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String st = br.readLine();
		int total = 0;
		for(int i =0; i<num;i++)
			total += Character.getNumericValue(st.charAt(i));
		
		System.out.println(total);
	}
}
