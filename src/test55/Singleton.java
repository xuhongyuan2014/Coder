package test55;

public class Singleton {
	private Singleton() {
	}
	private static Singleton instence=new Singleton();
	public static Singleton getSingleton(){
		return  instence;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Singleton.getSingleton());
}
}