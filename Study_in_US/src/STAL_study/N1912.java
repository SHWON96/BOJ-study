package STAL_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N1912 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int many = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int nums[] = new int[many];
		
		
		for(int i = 0; i<many;i++) {
			nums[i] = Integer.parseInt(st.nextToken());
			}
		int max = nums[0];
		
		for(int i =1; i<nums.length; i++) {
			if(nums[i-1]>0) {
				if(nums[i-1]+nums[i]>0)
					nums[i] += nums[i-1];
			}
			if(nums[i]>max)
				max = nums[i];
		}
		
		
		
		System.out.println(max);
		
	}

}
