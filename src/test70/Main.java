package test70;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] up={0,1,2,3,4,5,6,7,8,9};
		int [] down={0,1,2,3,4,5,6,7,8,9};
		boolean flag=true;
		while(flag){
			flag=false;
			for(int i=0;i<10;i++){//����UP����
				int count=0;
				for(int j=0;j<10;j++){//����DOWN����
					if(i==down[j]){
						count++;
					}
				}
				if(count!=down[i]){//����иı�����������
					flag=true;
				}
				down[i]=count;
			}
		}
		
		for(int i=0;i<10;i++){
			System.out.print(down[i]);
		}

	}
	
}
