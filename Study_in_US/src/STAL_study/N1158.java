package STAL_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class N1158 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int num = Integer.parseInt(st.nextToken());
		int mon = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> lsk = new LinkedList<Integer>();
		for(int i = 0; i<num; i++) {
			lsk.add(i+1);
		}
		Iterator<Integer> iterator = lsk.iterator();
		StringBuilder str = new StringBuilder();
		str.append("<");
		int count = 0;
		int pt = mon-1;
		
		while(!lsk.isEmpty()) {
			System.out.println(lsk.remove(pt+count));
			
			pt = pt + mon;
			if(pt>num) {
				pt = pt-(num);
			}
			
		}
		str.append(">");
		
		
}
		
		
		
		
		

}
