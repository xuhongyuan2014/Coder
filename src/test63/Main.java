package test63;
/*ȡ���е����{ȫ����VS�����Ӵ�VS���м���}*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n={1,2,3,4,5,6,7,8,9};
		Print(n);
		
		/*���ԣ��Զ���toBinary����*/
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
			temp = "0" + temp; // �ڲ����λ��ǰ���ӡ�0��
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
public static int [] toBinary(int n){//�Զ��������ת������
	int [] str=new int[9];
	for(int i=8;i>=0;i--){
		str[i]=(n&0x1);
		n=n>>1;
	}
	return str;
}
}
