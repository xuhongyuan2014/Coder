package test63;
/*取所有的组合{全排列VS所有子串VS所有集合}*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n={1,2,3,4,5,6,7,8,9};
		Print(n);
		
		/*测试，自定义toBinary函数*/
		int [] result=toBinary((int) Math.pow(2,n.length)-1);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]);
		}
		
		
	}
public static void Print(int [] n){
	int num=(int) Math.pow(2,n.length);
	for(int i=1;i<num;i++){
		String temp=Integer.toBinaryString(i);
		while(temp.length() < 9){
			temp = "0" + temp; // 在不足的位数前都加“0”
	       }
		StringBuilder result=new StringBuilder();
		for(int j=0;j<temp.length();j++){
			if(temp.charAt(j)=='1'){
				result.append(n[j]);
			}
		}
		System.out.println(result);
	}
}
public static int [] toBinary(int n){//自定义二进制转换函数
	int [] str=new int[9];
	for(int i=8;i>=0;i--){
		str[i]=(n&0x1);
		n=n>>1;
	}
	return str;
}
}
