package test41;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
getCommonlyWord(scan.nextLine());
	}

	public static void getCommonlyWord(String str){
		//���������ַ�
		String [] words=str.split(" ");
		for(int i=0;i<words.length;i++){
			String regEx = "[^A-Za-z0-9]";
			Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(words[i]);
            words[i]=m.replaceAll("").trim();
		}
		//���������ʽ���ͳ�Ʒ���wordMap
		Map<String,Integer> wordMap=new HashMap<String,Integer>();
		for(int i=0;i<words.length;i++){
			if(wordMap.containsKey(words[i])){
				int value=wordMap.get(words[i])+1;
				wordMap.put(words[i].toLowerCase(), value);
			}else {
				int value=1;
				wordMap.put(words[i].toLowerCase(), value);
			}
		}
		//Ѱ�ҳ��ִ�������word
		String resultKey="";
		int resultValue=0;
		for(Map.Entry<String,Integer> entry: wordMap.entrySet()){
			if(entry.getValue()>resultValue){
				resultKey=entry.getKey();
				resultValue=entry.getValue();
			}
			else if(!entry.getKey().equals("")&&!resultKey.equals("")&&entry.getValue()==resultValue&&entry.getKey().charAt(0)<resultKey.charAt(0)){
				resultKey=entry.getKey();
			}
			//System.out.print(entry.getKey()+"-"+entry.getValue()+"\n");
		}
		System.out.println(resultKey+" "+resultValue);
	}
}
