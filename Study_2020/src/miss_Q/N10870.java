package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10870 {
	
	public static int Fibo(int x) {
		if(x==1) {
			return x;
		}else if(x==0) {
			return 0;
		}else {
		return Fibo(x-1)+Fibo(x-2);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Fibo(Integer.parseInt(br.readLine())));
		
	}

}
