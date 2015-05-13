package test6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
Main program=new Main();
String str;
ArrayList<String> list=new ArrayList();
while((str=scan.nextLine())!=null)
	{if(str.endsWith("B"))
		{list.add(str);
		break;
		}
	 list.add(str);
	}
for(int i=0;i<list.size();i++){
	System.out.println(program.replace("marshtomp","fjxmlhx",list.get(i)));	
}

	}

	
	public String replace(String target,String result,String whole){
		int start=0;//开始指针
		int end=target.length()-1;//结尾指针
		boolean flag=false;
		String str="";
		while(start<=whole.length()-1){//target字符串从左向右移动，直到start指针到达whole字符串的结尾
			for(int i=0;i<=target.length()-1;i++){//待替换的target和整个字符串whole进行匹配
				if(whole.charAt(start+i)!=target.charAt(i)){//如果当前位置不匹配则跳出循环，如果匹配则进行下一个匹配
					break;
				}	
				if(i==target.length()-1&&isEqual(whole.charAt(start+i),target.charAt(i))){	//如果当前位置匹配，而且匹配进行到了字符串的结尾，则判定全部匹配。设置替换标志。
					flag=true;//替换当前的标志
				}
			}
			
			if(flag==true){//进行替换，指针向后移动target长度
				str=str+result;	
				start=start+target.length();
				end=end+target.length();
				flag=false;
			}
			else {//不进行替换，指针后移一个单位
			str=str+whole.charAt(start);
			start=start+1;
			end=end+1;
			}
		}
		return str;
		
	}
	public boolean isEqual(char a,char b){
		if(a>b&&(b+32)==a){return true;}
	    if(a<b&&(a+32)==b){return true;}
		if(a==b){return true;}
	    return false;
	}
}
