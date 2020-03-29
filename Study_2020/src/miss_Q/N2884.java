package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2884 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] input = br.readLine().split(" ");
		int hour = Integer.parseInt(input[0]);
		int min = Integer.parseInt(input[1]);
		
		if(min<45) {
			hour -= 1;
			min = min+15;
		}else if(min>=45) {
			min = min -45;
		}
		
		if(hour < 0){
			hour = hour+24;
		}
		sb.append(hour);
		sb.append(" ");
		sb.append(min);
		System.out.println(sb);
	}

}
