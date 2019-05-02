package STAL_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2225 {

	static int comb(int n , int r)
	{
		if( r== 0 || n == r)
			return 1;
		else
			return comb(n-1,r)%1000000000+comb(n-1,r-1)%1000000000;
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int num = Integer.parseInt(st.nextToken());
		int mon = Integer.parseInt(st.nextToken());

		// num +mon-1 C mon-1
		//6c2 6*5/2*1 
		// 20 2
		// a+b = 20
		// 21c1
		// 5 3
		//6 c 2
		// 6*5/2*1
		// 6/2 * 5/1
		
		//a+b+c = 10
		// 10 3 
		// 12C2
		
		System.out.println(comb(num+mon-1,mon-1)%1000000000);
	}

}
