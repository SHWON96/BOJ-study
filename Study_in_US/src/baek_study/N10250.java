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
		
		rooms = pnum/height;	//��, ȣ
		nheight = pnum%height;	// ������, ��
		
		//���� ���� = ��*����+������
		// �� = pnum/height			���� ȣ��
		// ������ = pnum%height		�������� ����, �������� 0�̸� ����ȣ�� �� ����
		
		
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
