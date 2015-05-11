package test2;

import java.util.Scanner;

public class Main {

	public char[] str;
	Main(char[] str){
		this.str=str;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		String b=scan.next();
		Main program=new Main((a+b).toCharArray());
		program.sort();
		program.operateArray();
		program.print();
	}
	public void print(){		
		System.out.println(str);
	}
	public void sort(){
		for(int i=0;i<str.length;i=i+2){//偶数下标排序
			for(int j=i+2;j<str.length;j=j+2){
				if(str[i]>str[j]){
					char temp=str[i];
					str[i]=str[j];
					str[j]=temp;					
				}			
			}		
		}		
		for(int i=1;i<str.length;i=i+2){//奇数下标排序
			for(int j=i+2;j<str.length;j=j+2){
				if(str[i]>str[j]){
					char temp=str[i];
					str[i]=str[j];
					str[j]=temp;					
				}			
			}		
		}
		
	}
	public void operateArray(){
		for(int i=0;i<str.length;i++){
			if((str[i]>='0'&&str[i]<='9')){			
				str[i]=toChar(toByte(str[i]-48));
			}
			if((str[i]>='A'&&str[i]<='F')){			
				str[i]=toChar(toByte(str[i]-55));
			}
			if((str[i]>='a'&&str[i]<='f')){			
				str[i]=toChar(toByte(str[i]-87));
			}
		}
		
	}
	
	public static String toByte(int n){//将数字转换成二进制
		String re = "";		
		while(re.length() < 4){
			re = n%2 + re;
			n = n/2;
		}	
		return re;
	}
	public char toChar(String str){//将二进制字符串转换成反转后对应的数，再转换成16进制的字符
		int result=0;
		for(int i=0;i<str.length();i++){
			result=(int) (result+(str.charAt(i)-48)*Math.pow(2, i));			
		}		
		if(result>=0&&result<=9){
			return (char) (result+48);		
		}
		else {
			return (char) (result+55);			
		}
	}
}
