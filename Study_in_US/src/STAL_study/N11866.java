package STAL_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N11866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int num = Integer.parseInt(st.nextToken());
		int mon = Integer.parseInt(st.nextToken());
		
		Queue<Integer> que = new LinkedList<>();
		for(int i = 0; i<num; i++) {
			que.add(i+1);
		}
		int a;
		StringBuilder sb = new StringBuilder("<");
		
		while(num != 0) {
			for(int i =0;i<mon-1;i++) {
				a = que.poll();
				que.add(a);
			}
			sb.append(que.poll());
			
			if(que.size()!=0)
				sb.append(", ");
			num--;
		}
		sb.append(">");
		System.out.println(sb);

	}

}
