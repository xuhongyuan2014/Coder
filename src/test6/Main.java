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
		int start=0;//��ʼָ��
		int end=target.length()-1;//��βָ��
		boolean flag=false;
		String str="";
		while(start<=whole.length()-1){//target�ַ������������ƶ���ֱ��startָ�뵽��whole�ַ����Ľ�β
			for(int i=0;i<=target.length()-1;i++){//���滻��target�������ַ���whole����ƥ��
				if(whole.charAt(start+i)!=target.charAt(i)){//�����ǰλ�ò�ƥ��������ѭ�������ƥ���������һ��ƥ��
					break;
				}	
				if(i==target.length()-1&&isEqual(whole.charAt(start+i),target.charAt(i))){	//�����ǰλ��ƥ�䣬����ƥ����е����ַ����Ľ�β�����ж�ȫ��ƥ�䡣�����滻��־��
					flag=true;//�滻��ǰ�ı�־
				}
			}
			
			if(flag==true){//�����滻��ָ������ƶ�target����
				str=str+result;	
				start=start+target.length();
				end=end+target.length();
				flag=false;
			}
			else {//�������滻��ָ�����һ����λ
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
