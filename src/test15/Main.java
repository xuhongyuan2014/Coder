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
		list.insert(-5, "��һ");
		list.insert(5, "����");
		list.insert(1, "�ڶ�");
		list.print();

	}

	public static void printListFromTailToHead(ListNode listNode) {//�ӽ�β��ͷ���ݹ����
		if (listNode.next != null)
			printListFromTailToHead(listNode.next);
		System.out.println(listNode.val);
	}

}

class ListNode {//���
	Object val;
	ListNode next = null;

	ListNode(Object val) {
		this.val = val;
	}
}

class NodeList {//����
	public ListNode first;
	public int pos = 0;

	public void insertFirst(Object obj) {//����ͷ���
		ListNode node = new ListNode(obj);
		first = node;
	}

	public void insert(int index, Object obj) {//��indexλ�ò���
		ListNode flag = first;
		pos=0;//ע���ʼ��λ��
		while (pos != index) {
			if(pos>index){System.out.println("������Χ����ͷ������");break;}
			if (flag.next == null) {
				System.out.println("������Χ����β������");
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
	public void print(){//��ӡ
		ListNode flag=first;
		while(flag.next!=null){
			System.out.println(flag.val);
			flag=flag.next;
		}
		System.out.println(flag.val);
	}
}