package level1_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N11721 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		int len = st.length();
		
		for(int i=0; i<=len/10 ; i++) {
			if((i+1)*10>len-1)
				System.out.println(st.substring(i*10, len));
			else
				System.out.println(st.substring(i*10, (i+1)*10));
		}
	}

}
