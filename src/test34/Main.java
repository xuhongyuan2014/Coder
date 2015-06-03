package test34;

public class Main {
	public static void main(String [] args){
		System.out.println(test());
	}
	public static int test(){
		int a=1;
		try{
			a=6;
			System.out.println("try"+a);
			return a;
		}
		catch(Exception e){
			
		}
		finally{
			a=5;
			System.out.println("finally"+a);
			//return a;
		}
		System.out.println("end"+a);
		return a;
	}
}
