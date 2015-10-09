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
    public static int flag=0;//计数
    public static String result;//存放结果
    public String getPermutation(int n, int k) {
        List data=new ArrayList();//转换成List
        for(int i=1;i<=n;i++){
        	data.add(i);
        }
        Sort(data,new ArrayList(),n,k);
        return result;
    }
    public void Sort(List data,List target,int num,int k){//num位全排列，取第K次的结果
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
        for(int i=0;i<data.size();i++){//递归取
            List newData=new ArrayList(data);
            List newTarget=new ArrayList(target);
            newTarget.add(newData.get(i));
            newData.remove(i);
            Sort(newData,newTarget,num,k);
        }
    }
}