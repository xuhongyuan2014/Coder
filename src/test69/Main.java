package test69;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int [][] num={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(num[i][j]);
				if(j==n-1){
					System.out.println();	
				}
			}
		}
		System.out.println("上三角");
		for(int i=0;i<n;i++){
			int left=0;
			int right=i;
			while(left<n&&right>=0){
				System.out.print(num[left][right]);
				left=left+1;
				right=right-1;
			}
		}
		System.out.println();
		System.out.println("下三角");
		for(int i=n-1;i>=0;i--){
			int left=n-1-i;
			int right=n-1;
			while(left<n&&right>=0){
				System.out.print(num[left][right]);
				left=left+1;
				right=right-1;
			}
		}
	}

}
