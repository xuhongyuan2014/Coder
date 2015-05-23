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
      System.out.println("先序遍历:");
      program.printPre(boot);
      System.out.println();
      System.out.println("中序遍历:");
      program.printIn(boot);
      System.out.println();
      System.out.println("后序遍历:");
      program.printBac(boot);
	}
	 public  TreeNode reConstructBinaryTree(String pre,String in) {//pre为先序遍历的字符串;in为中序遍历的字符串；首先通过pre推出根节点，然后在in里将树分为左子树和右子树；通过递归将所有的节点都找出
		 if(pre.length()==0)return null;
		   TreeNode boot=new TreeNode(pre.charAt(0));
		 if(pre.length()!=1) {
	    int index=in.indexOf(pre.charAt(0)); 
	    String leftPre=pre.substring(1, index+1);//左子树先序遍历字符串   注：subSting方法(a,b)截取的是下标从a到b-1的子串。
	    String leftIn=in.substring(0, index);//左子树中序遍历字符串
	    String rightPre=pre.substring(index+1, pre.length());//右子树先序遍历字符串
	    String rightIn=in.substring(index+1, in.length());//右子树中序遍历字符串
	   // System.out.println("left:"+leftPre+"---"+leftIn);
	    //System.out.println("right:"+rightPre+"---"+rightIn);    
	    boot.left=reConstructBinaryTree(leftPre,leftIn);
	    boot.right=reConstructBinaryTree(rightPre,rightIn);
		 }
	    return boot;
	    }
	 public  void printPre(TreeNode boot){//先序遍历打印
		if(boot!=null){ 
		System.out.print(boot.val.toString());
		 printPre(boot.left);
		 printPre(boot.right);	 
		}
	 }
	 public void printIn(TreeNode boot){//中序遍历打印
		 if(boot!=null){
			 printIn(boot.left);
			 System.out.print(boot.val.toString());
			 printIn(boot.right);			 
		 }	 
	 }
	 public void printBac(TreeNode boot){//后序遍历打印
		 if(boot!=null){
			 printBac(boot.left);
			 printBac(boot.right);	
			 System.out.print(boot.val.toString());
		 }	 
	 }
}
class TreeNode {//树节点定义
     Object val;
     TreeNode left;
     TreeNode right;
     TreeNode(Object x) { val = x; }
}