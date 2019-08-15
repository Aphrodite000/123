class ListNode {
	int val;
	ListNode next;
	ListNode (int x) {
		val=x;
	}
}
class Solution {
	//逆置单链表  0601
	public ListNode reverseList(ListNode head) {
		//一次遍历原链表中的每个结点，在头插到新链表当中；
		ListNode newList=null;//newList具有两个含义，新链表的第一个结点，代表整个链表
		ListNode cur=head;
		while(cur!=null) {
			//因为cur.next会变化，所以先要保存下来
			ListNode next=cur.next;
			//头插
			cur.next=newList;
			newList=cur;
			//让cur往后遍历；
			cur=next;
		}
		return newList;
	}
	public static void displayLinkedList(ListNode head) {
		for(ListNode cur=head;cur!=null;cur=cur.next) { 
		//遍历了所有的元素，且cur最后指向了null
			System.out.printf("(%d)-->",cur.val);
		}//while(cur!=null){cur=cur.next;}
		System.out.println("null");
	}
}
public class Example22 {
	public static void main(String[] args) {
		ListNode n1=new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		
		n1.next = n2; 
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		Solution s=new Solution();//这个构造方法Solution()是系统默认的构造方法，构造了一个对象
		ListNode result=s.reverseList(n1);//调用对象s的reverseList()方法，它的返回值赋给result
		//return result;
		//打印result;
		s.displayLinkedList(result);//调用s这个类中的方法
	}
}