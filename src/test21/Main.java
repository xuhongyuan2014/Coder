package test21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(trimString(scan.nextLine()));

	}
	public static String trimString(String str){			

		int [] num=new int [27];
		for(int i=0;i<27;i++){//��ʼ��Ϊ0
			num[i]=0;		
		}
		for(int i=0;i<str.length();i++){
			num[str.charAt(i)-'a']++;	//��Ӧ����ĸ��Ӧ---�����±�	
		}
		int min=num[0];
		for(int i=0;i<27;i++){//�ҳ���Сֵ
			if(min==0&&num[i]!=0)min=num[i];
			else 
			if(num[i]!=0&&num[i]<min){
				min=num[i];				
			}			
		}
		List<Character> list=new ArrayList<Character>();
		for(int i=0;i<27;i++){//�����ɾ������
			if(num[i]==min){
				char temp=(char) (i+'a');//ע��:�±��Ӧ��Ӧ����ĸ
				list.add(temp);
			}		
		}
		StringBuilder result=new StringBuilder();
		for(int i=0;i<str.length();i++){//ƴ�ӽ���ַ���
			if(!list.contains(str.charAt(i))){
				result.append(str.charAt(i));
			}	
		}
		return result.toString();
	}

}
