package test57;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n={4,5,6,7,8,1,2,3};
		System.out.println(findMin(n,0,n.length-1));
	}
public static int findMin(int [] n,int left,int right){
	if(n.length==1) return n[0];
	if(n.length<=0) return 0;
	int mid=(left+right)/2;
     if(n[mid]>n[left]) {return findMin(n,mid,right);}
	else if(n[mid]<n[left]){return findMin(n,left,mid);}
     return Math.min(n[mid], n[mid+1]);
	
}
}
