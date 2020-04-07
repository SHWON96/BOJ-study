package miss_Q;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2167 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] input = new int[N][M];
		
		for(int i=0; i<N;i++) {
				st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++)
				input[i][j] = Integer.parseInt(st.nextToken());
			
		}
		
		
		int testcase = Integer.parseInt(br.readLine());
		int[][] testlist = new int[testcase][4];
		
		for(int i=0; i<testcase;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<4;j++) {
				testlist[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		StringBuilder sb = new StringBuilder();
		int sum;
		for(int i = 0;i<testcase;i++) {
			sum = 0;
			for(int j=testlist[i][0]-1;j<=testlist[i][2]-1;j++) {
				for(int k=testlist[i][1]-1;k<=testlist[i][3]-1;k++) {
					sum = sum+input[j][k];
				}
			}
				
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
		}
		
	}




