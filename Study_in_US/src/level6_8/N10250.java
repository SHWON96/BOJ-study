package baek_study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N10250 {

	public static void findroom(String input) {
		String[] arr = input.split(" ");
		int height = Integer.parseInt(arr[0]);
		int rooms, nheight;// 
		int roomnum = Integer.parseInt(arr[1]);
		int pnum = Integer.parseInt(arr[2]);
		
		rooms = pnum/height;	//몫, 호
		nheight = pnum%height;	// 나머지, 층
		
		//들어온 순서 = 몫*높이+나머지
		// 몫 = pnum/height			몫이 호실
		// 나머지 = pnum%height		나머지가 층수, 나머지가 0이면 이전호의 맨 윗층
		
		
		if(nheight == 0)
			System.out.println((rooms)+height*100);
		else
			System.out.println((rooms+1)+nheight*100);
	}
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testN = Integer.parseInt(br.readLine());
		String[] gset = new String[testN];
		
		for(int i = 0; i<testN ; i++) {
			gset[i] = br.readLine();
		}
		
		for(int i = 0; i<testN ; i++) {
			findroom(gset[i]);
		}
		
	}

}
