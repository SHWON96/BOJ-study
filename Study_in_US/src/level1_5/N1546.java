package level1_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1546 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int temp = 0;
		StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
		int max = 0;
		double[] scores = new double[num];
		double total = 0;
		for(int i=0; i<num; i++) {
			temp = Integer.parseInt(st1.nextToken());
			scores[i]= temp;
			if(temp>max)
					max = temp;
		}
		for(int i = 0; i<scores.length; i++)
			scores[i] = scores[i]/max*100;
			
		for(int i = 0; i<scores.length; i++)
			total += scores[i]; 
		System.out.println(total/scores.length);
	
	}
	

}
