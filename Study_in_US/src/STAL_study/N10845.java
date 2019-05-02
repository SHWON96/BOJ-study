package STAL_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class N10845 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		ArrayList<Integer> ar = new ArrayList<Integer>();

		for(int i = 0 ; i<num ; i++) {
			String put = br.readLine();
			String[] input = put.split(" ");
			if(input[0].equals("push")) {
				ar.add(Integer.parseInt(input[1]));
			}else if(input[0].equals("pop")) {
				if(ar.isEmpty()) {
					System.out.println("-1");
					}else {
					System.out.println(ar.remove(0));
				}		
			}else if(input[0].equals("size")) {
				System.out.println(ar.size());
			}else if(input[0].equals("empty")) {
				if(ar.isEmpty()) {
					System.out.println(1);
				}else{
					System.out.println(0);
				}
			}else if(input[0].equals("front")) {
				if(ar.isEmpty()) {
					System.out.println("-1");
					}else {
				System.out.println(ar.get(0));
				}
			}else if(input[0].equals("back")) {
				if(ar.isEmpty()) {
					System.out.println("-1");
					}else {
				System.out.println(ar.get(ar.size()-1));
				}
			}
		}

	}

}
