package level1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2742 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			int[] nums = new int[num];
			for(int i = num; i > 0 ; i--) 
				nums[num-i] = i;
			
		for(int i = 0; i< nums.length; i++)
			System.out.println(nums[i]);
	}
}
