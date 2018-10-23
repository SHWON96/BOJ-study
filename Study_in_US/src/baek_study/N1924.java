package baek_study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N1924 {
	
	public static int day7(int month, int day) {
		int resmon = month-2;
		int reday = day-1;
		
		switch(month){
		case 1:
			reday = reday%7;
				break;
		case 3:
			reday = 28+resmon*31+reday;
			reday = reday%7;	
				break;
		case 4:
			reday = 28+resmon*31+reday;
			reday = reday%7;
				break;
		case 5:
			reday = 28+resmon*31+reday-1;
			reday = reday%7;
				break;
		case 6:
			reday = 28+resmon*31+reday-1;
			reday = reday%7;
				break;
		case 7:
			reday = 28+resmon*31+reday-2;
			reday = reday%7;
				break;
		}	
		return reday;
	}
	
	public static int day8(int month, int day) {
		int resmon = month-2;
		int reday = day-1;
		
		switch(month){
		case 8:
			reday = 28+resmon*31+reday-2;
			reday = reday%7;
				break;
		case 9:
			reday = 28+resmon*31+reday-2;
			reday = reday%7;	
				break;
		case 10:
			reday = 28+resmon*31+reday-3;
			reday = reday%7;
				break;
		case 11:
			reday = 28+resmon*31+reday-3;
			reday = reday%7;
				break;
		case 12:
			reday = 28+resmon*31+reday-4;
			reday = reday%7;
				break;
		}	
		
		return reday;
			
	}

	public static int day28(int month, int day) {
		int reday = day+31-1;
		reday = reday%7;	
		return reday;
	}
	
	public static String result(int a) {
		int reday = a;
		String result="";
		if(reday == 0)
			result = "MON";
		else if(reday == 1)
			result = "TUE";
		else if(reday == 2)
			result = "WED";
		else if(reday == 3)
			result = "THU";
		else if(reday == 4)
			result = "FRI";
		else if(reday == 5)
			result = "SAT";
		else if(reday == 6)
			result = "SUN";
		return result;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String date = br.readLine();
		String[] mth = date.split(" ");
		int[] mthday = new int[2];
		//System.out.println(mthday[0]+mthday[1]);	
		for(int i=0; i<mth.length;i++) {
			mthday[i] = Integer.parseInt(mth[i]);
		}
		
		if(mthday[0]==1||mthday[0]==3||mthday[0]==4|mthday[0]==5||mthday[0]==6||mthday[0]==7)
			System.out.println(result(day7(mthday[0],mthday[1])));
		else if(mthday[0]==2)
			System.out.println(result(day28(mthday[0],mthday[1])));
		else
			System.out.println(result(day8(mthday[0],mthday[1])));
		
	}

}
