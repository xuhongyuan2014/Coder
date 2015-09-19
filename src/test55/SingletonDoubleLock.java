package test55;
//˫��������Ƶ���ģʽ---��ֻ֤���ڵ�һ�δ���ʵ����ʱ��Ž���synchronizedͬ������
public class SingletonDoubleLock {
	private SingletonDoubleLock(){
	}
	private static SingletonDoubleLock instance=null;
	public static SingletonDoubleLock getInstance(){
		if(instance==null){
			synchronized(SingletonDoubleLock.class){
				if(instance==null){
					instance=new SingletonDoubleLock();
				}
			}
		}
		return instance;
	}
}
