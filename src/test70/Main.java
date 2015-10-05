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
			for(int i=0;i<10;i++){//遍历UP数组
				int count=0;
				for(int j=0;j<10;j++){//遍历DOWN数组
					if(i==down[j]){
						count++;
					}
				}
				if(count!=down[i]){//如果有改变的则继续遍历
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
