package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1065 {
	public static int hannumber(int a){
		int num1 = a/100;
		int num2 = a/10%10;
		int num3 = a%10;
		
		if(num2*2 == num1+num3) {
			return 1;
		}else {
			return 0;
			}
	}
		public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			int max = Integer.parseInt(br.readLine());
			int count = 0;
			if(max<100) {
				System.out.println(max);
			}else {
				count = 99;
			for(int i=100; i<=max;++i) {
				count = count+hannumber(i);
			}
			//if(max==1000) count--;
			System.out.println(count);
			}
			System.out.println(hannumber(1000));
//			System.out.println(987%10);
			
		
		
	}
}