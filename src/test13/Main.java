package test13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		scan.nextLine();
		String[] array=new String[num];
		for(int i=1;i<=num;i++){			
			String str = scan.nextLine();	
			array[i-1]=str;	
		}
		for(int i=0;i<num;i++){
			operateData(array[i]);			
		}
		
	}

	public static void operateData(String str){
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			char temp=str.charAt(i);
			if(map.containsKey(temp)){map.put(temp, (int)map.get(temp)+1);}
			else map.put(temp, 1);			
		}
/*		Map<Integer,Integer> resultmap=new HashMap<Integer,Integer>();		
		for(Map.Entry<Character, Integer> entry:map.entrySet()){
			Integer num=entry.getValue();
			if(resultmap.containsKey(num)){resultmap.put(num, resultmap.get(num)+1);}
			else resultmap.put(num, 1);			
		}*/
	int[] num = new int[map.size()];
	int i = 0;
	for(char c : map.keySet()){
		num[i++] = map.get(c);
	}
    sort(num);
    int flag=26;
    int result=0;
    for(int j=0;j<num.length;j++){
    	result=result+num[j]*flag;
    	flag=flag-1; 	
    }
	System.out.println(result);
	}
	public static void sort(int[] num){//Ã°ÅÝÅÅÐò
		for(int i=0;i<num.length;i++){
			for(int j=num.length-1;j>i;j--){
				if(num[j]>num[j-1]){
					int temp=num[j-1];
					num[j-1]=num[j];
					num[j]=temp;				
				}
				
			}
			
		}
		
	}
}
