package test19;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	/**
	 * @param arg
	 *  12473568
47215386
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      String pre=scan.nextLine();
      String in=scan.nextLine();
      Main program=new Main();
      TreeNode boot=program.reConstructBinaryTree(pre,in);
      System.out.println("�������:");
      program.printPre(boot);
      System.out.println();
      System.out.println("�������:");
      program.printIn(boot);
      System.out.println();
      System.out.println("�������:");
      program.printBac(boot);
	}
	 public  TreeNode reConstructBinaryTree(String pre,String in) {//preΪ����������ַ���;inΪ����������ַ���������ͨ��pre�Ƴ����ڵ㣬Ȼ����in�ｫ����Ϊ����������������ͨ���ݹ齫���еĽڵ㶼�ҳ�
		 if(pre.length()==0)return null;
		   TreeNode boot=new TreeNode(pre.charAt(0));
		 if(pre.length()!=1) {
	    int index=in.indexOf(pre.charAt(0)); 
	    String leftPre=pre.substring(1, index+1);//��������������ַ���   ע��subSting����(a,b)��ȡ�����±��a��b-1���Ӵ���
	    String leftIn=in.substring(0, index);//��������������ַ���
	    String rightPre=pre.substring(index+1, pre.length());//��������������ַ���
	    String rightIn=in.substring(index+1, in.length());//��������������ַ���
	   // System.out.println("left:"+leftPre+"---"+leftIn);
	    //System.out.println("right:"+rightPre+"---"+rightIn);    
	    boot.left=reConstructBinaryTree(leftPre,leftIn);
	    boot.right=reConstructBinaryTree(rightPre,rightIn);
		 }
	    return boot;
	    }
	 public  void printPre(TreeNode boot){//���������ӡ
		if(boot!=null){ 
		System.out.print(boot.val.toString());
		 printPre(boot.left);
		 printPre(boot.right);	 
		}
	 }
	 public void printIn(TreeNode boot){//���������ӡ
		 if(boot!=null){
			 printIn(boot.left);
			 System.out.print(boot.val.toString());
			 printIn(boot.right);			 
		 }	 
	 }
	 public void printBac(TreeNode boot){//���������ӡ
		 if(boot!=null){
			 printBac(boot.left);
			 printBac(boot.right);	
			 System.out.print(boot.val.toString());
		 }	 
	 }
}
class TreeNode {//���ڵ㶨��
     Object val;
     TreeNode left;
     TreeNode right;
     TreeNode(Object x) { val = x; }
}