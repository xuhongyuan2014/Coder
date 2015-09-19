package test55;
//双检测锁机制单例模式---保证只有在第一次创建实例的时候才进入synchronized同步机制
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
