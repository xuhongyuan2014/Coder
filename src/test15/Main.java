package test15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] str = scan.nextLine().split(" ");
		ListNode head = new ListNode(0);
		head.next = new ListNode(Integer.valueOf(str[0]));
		ListNode temp = head.next;
		for (int i = 0; i < str.length - 1; i++) {
			temp.next = new ListNode(Integer.valueOf(str[i + 1]));
			temp = temp.next;
		}
		printListFromTailToHead(head);
		
		NodeList list=new NodeList();
		list.insertFirst("first");
		list.insert(-5, "第一");
		list.insert(5, "第三");
		list.insert(1, "第二");
		list.print();

	}

	public static void printListFromTailToHead(ListNode listNode) {//从结尾到头结点递归输出
		if (listNode.next != null)
			printListFromTailToHead(listNode.next);
		System.out.println(listNode.val);
	}

}

class ListNode {//结点
	Object val;
	ListNode next = null;

	ListNode(Object val) {
		this.val = val;
	}
}

class NodeList {//链表
	public ListNode first;
	public int pos = 0;

	public void insertFirst(Object obj) {//插入头结点
		ListNode node = new ListNode(obj);
		first = node;
	}

	public void insert(int index, Object obj) {//在index位置插入
		ListNode flag = first;
		pos=0;//注意初始化位置
		while (pos != index) {
			if(pos>index){System.out.println("超出范围！在头部插入");break;}
			if (flag.next == null) {
				System.out.println("超出范围！在尾部插入");
				break;
			} else {
				flag = flag.next;
			}
			pos++;
		}
		ListNode temp=flag.next;
		flag.next=new ListNode(obj);
		flag.next.next=temp;
	}
	public void print(){//打印
		ListNode flag=first;
		while(flag.next!=null){
			System.out.println(flag.val);
			flag=flag.next;
		}
		System.out.println(flag.val);
	}
}