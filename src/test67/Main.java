package test67;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*ȫ����---------------�ݹ�*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] data={"a","b","c","d"};
		Sort(Arrays.asList(data),new ArrayList(),4);
	}
	public static void Sort(List data,List target,int num){
		if(target.size()==num){
			for(Object obj :target){
				System.out.print(obj);
			}
			System.out.println();
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
