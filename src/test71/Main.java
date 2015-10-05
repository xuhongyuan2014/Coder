package test71;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(checkDifferent(scan.nextLine()));
	}

	    public static boolean checkDifferent(String iniString) {
	        // write code here
	    	Map<Character,Integer> map=new HashMap<Character,Integer>();
	    	for(int i=0;i<iniString.length();i++){
	    		if(!map.containsKey(iniString.charAt(i))){
	    			map.put(iniString.charAt(i), 1);
	    		}
	    		else {
	    			return false;
	    		}
	    	}
	    	return true;
	    }

}
