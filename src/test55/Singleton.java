package test55;
//����ģʽ---�����ʱ����
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
 * ����ģʽ---��Ҫ��ȡʱ�Ŵ���
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