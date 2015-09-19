package test55;
//饿汉模式---类加载时创建
public class Singleton {
	private Singleton() {
	}
	private static Singleton instance=new Singleton();
	public static Singleton getSingleton(){
		return  instance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Singleton.getSingleton());
}
}
/*
 * 懒汉模式---需要获取时才创建
 * public class Singleton {
 *
	private Singleton() {
	}
	private static Singleton instance=null;
	public static Singleton getSingleton(){
		if(instance==null){
			instance=new Singleton();
		}
		return  instance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Singleton.getSingleton());
}
}*/