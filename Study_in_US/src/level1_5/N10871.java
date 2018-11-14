package level1_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10871 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st1 = new StringTokenizer(br.readLine()," ");;
		int num = Integer.parseInt(st1.nextToken());
		int lim = Integer.parseInt(st1.nextToken());
		StringTokenizer st2 = new StringTokenizer(br.readLine()," ");;
		int a = 0;
		for(int i=0; i<num ; i++) {
			a = Integer.parseInt(st2.nextToken());
			if(lim > a) {
				sb.append(a + " ");
			}
		}
		System.out.println(sb);
			
	}

}
