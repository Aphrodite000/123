class Node {
	//同Practice16  链表的头插和尾插
	public int value;
	public Node next=null; 
	//链表元素的下一个为空
	public Node(int value) {
		this.value=value;
	}
}
public class Example23 {
	public static void display(Node head) {
		//遍历一个链表
		for(Node cur=head;cur!=null;cur=cur.next) { 
		//遍历了所有的元素，且cur最后指向了null
			System.out.printf("(%d)-->",cur.value);
		}//while(cur!=null){cur=cur.next;}
		System.out.println("null");
	}//对象.属性
	public static Node pushFront(Node head,int value) {
		//头插
		Node node=new Node(value);
		node.next=head;
		return node;
	}
	public static Node pushBack(Node head,int value){
		//尾插
		Node node=new Node(value);
		if(head==null) {
			return pushFront(head,value);//head为空时，尾插相当于头插
			//node.next=head;
			//return node;
		}else{
			Node last=getLast(head);
			last.next=node;
			return head;
		}
	}
	public static Node getLast(Node head) {
		Node last=head;
		while(last.next!=null) {
			last=last.next;
		}
		return last;
	}
	public static void main (String[] args) {
		Node head=null;
		head=pushBack(head,1);
		head=pushBack(head,2);
		head=pushBack(head,3);
		display(head);
		head=pushFront(head,10);
		head=pushFront(head,20);
		head=pushFront(head,30);
		display(head);
	}
}