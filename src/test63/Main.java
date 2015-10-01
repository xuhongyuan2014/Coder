package test63;
/*取所有的组合*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n={1,2,3,4,5,6,7,8,9};
		Print(n);
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
}
