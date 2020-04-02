package miss_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2775 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int Testcase = Integer.parseInt(st.nextToken());
		int[][] testkn = new int[Testcase][2];
		for(int i=0; i<Testcase; i++) {
			testkn[i][0] = Integer.parseInt(br.readLine());
			testkn[i][1] = Integer.parseInt(br.readLine());
			
		}
		int[][] nums = new int[15][14];
		
		
		for(int i=0;i<14;i++) {
			nums[0][i] = i+1;
		}
		// i´Â Ãþ, j´Â È£
		for(int i=1; i<15;i++) {
			for(int j=0; j<14;j++) {
				int temp = 0;
				for(int k=0;k<=j;k++) {
					temp = temp + nums[i-1][k];
				}
				nums[i][j] = temp;
			}
		}
	
		//System.out.println(nums[0][2]);
		for(int t=0;t<Testcase;t++) {
			System.out.println(nums[testkn[t][0]][testkn[t][1]-1]);
		}
	}
}
