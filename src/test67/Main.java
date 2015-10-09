package test67;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*È«ÅÅÁÐ---------------µÝ¹é*/
public class Main {
	public static int flag=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] data={"a","b","c"};
		Sort(Arrays.asList(data),new ArrayList(),3);
	}
	public static void Sort(List data,List target,int num){
		if(target.size()==num){
			for(Object obj :target){
				System.out.print(obj);
			}
			flag++;
			System.out.println(flag);
		}
		for(int i=0;i<data.size();i++){
			List newData=new ArrayList(data);
			List newTarget=new ArrayList(target);
			newTarget.add(data.get(i));
			newData.remove(i);
			Sort(newData,newTarget,num);
		}
	}
}
