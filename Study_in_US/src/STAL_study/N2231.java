
package STAL_study;
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class N2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int many = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> list  = new ArrayList<Integer>();
		
		int h = (many-27)/100;
		int t =(many-101*h-18)/10;
		
		// 262 = 248 + 2 + 4 + 8
		// (262-27)/100 --> 2
		// 262-202 = 60
		// (60-18)/10 --> 4 or 5 or 6
		// 
		// 이때 남은게 짝수여야함.
		// 255 + 2 + 5 + 5
		
		//216 = 198 + 1 + 9 + 8
		// (216 - 18)/100 --> 1
		// 216 - 101 = 115
		// (115 -9)/10 = 9
		
		
		//166 = 155 + 1 + 5 + 5
		// (166-18)/100 --> 1 
		// 166-101 --> 65
		// (65-9)/10 --> 5 or 6
		// 
		for(int a = 0; a<2; a++) {
			for(int b=t;b<10;b++) {
				for(int c= 0; c<10;c++)
					if(101*h+11*b+2*c==many) {
						sb.append(100*h+10*b+c + "\n");
						list.add(100*h+10*b+c);
					}
			}
			h++;
			t=0;
		}
		Collections.sort(list);
		System.out.println(sb);
		if(list.isEmpty())
			System.out.println(0);
			else
				System.out.println(list.get(0));
	}
	
}
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int length = Integer.toString(N).length();  // N의 길이
        int result = 0;
        
        // 256 = 245 + 2 + 4 + 5
        // 
        // 각각의 자리에 최대 9까지 들어갈 수 있음
        
        for (int i = N - (length * 9); i <= N; i++) {
            // 자연수가 아닐 경우 생략
            if (i <= 0) {
                continue;
            }

            // sum = abc + a + b + c
            int sum = i;
            for (int j = 0; j < length; j++) {
                sum += (i / Math.pow(10, j)) % 10;
            }

            if (sum == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
