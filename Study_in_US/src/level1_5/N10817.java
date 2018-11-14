package level1_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10817 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int med = a;
		
		if(a <= b) {
			if( b <= c) {
				med = b;
			}else if(c <= b)
				if(a <= c)
					med = c;
		}else if(a >= b){
			if(b >= c) {
				med = b;
			}else if(c <= a){
				med = c;
			}
		}
		System.out.println(med);
	}

}
