package test68;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		System.out.println(s.getPermutation(9, 13531));
	}

}
class Solution {
    public static int flag=0;//����
    public static String result;//��Ž��
    public String getPermutation(int n, int k) {
        List data=new ArrayList();//ת����List
        for(int i=1;i<=n;i++){
        	data.add(i);
        }
        Sort(data,new ArrayList(),n,k);
        return result;
    }
    public void Sort(List data,List target,int num,int k){//numλȫ���У�ȡ��K�εĽ��
        if(target.size()==num){
            flag++;
            if(flag==k){
                StringBuilder s=new StringBuilder();
                for(Object obj:target){
                    s.append(obj);
                }
                result=s.toString();
            }
        }
        for(int i=0;i<data.size();i++){//�ݹ�ȡ
            List newData=new ArrayList(data);
            List newTarget=new ArrayList(target);
            newTarget.add(newData.get(i));
            newData.remove(i);
            Sort(newData,newTarget,num,k);
        }
    }
}