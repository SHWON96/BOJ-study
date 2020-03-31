package miss_Q;

import java.util.ArrayList;

public class N4673 {
	public static int dnum(int a) {
		
		return a+a%10+a%100/10+a%1000/100+a%10000/1000;
	}
	
	public static void main(String[] args) {
		int result = 0;
		ArrayList<Integer> ar = new ArrayList();
		ArrayList<Integer> df = new ArrayList();
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<10000;i++) {
			ar.add(dnum(i));
			df.add(i);
			result = dnum(i);

		}
		System.out.println(ar.indexOf(18));
		System.out.println(ar.size());
		
		
		for(int i=0; i<ar.size();i++) {
			df.remove(ar.get(i));
		}
		for(int i=0; i<df.size();i++)
			System.out.println(df.get(i));
	}
}
