class Node { //链表(1)基础  0601
	public int value;//保存结点中的数据
	public Node next;//指向下一个结点的引用
	                 //特殊值null
    public Node(int value) {
		this.value=value;
		this.next=null;
	}
}
public class Example19 {
	//遍历一个链表
	public static void displayLinkedList(Node head) {
		for(Node cur=head;cur!=null;cur=cur.next) { 
		//遍历了所有的元素，且cur最后指向了null
			System.out.printf("(%d)-->",cur.value);
		}//while(cur!=null){cur=cur.next;}
		System.out.println("null");
	}
	//创建一个链表
	public static Node createLinkedList() {
		Node n1=new Node(1);//首结点 属性初始化， new 后面是构造方法，
		Node n2=new Node(2);//A p1=new A;A是类，定义了一个A类的对象;A(),是构造方法
		Node n3=new Node(3);//定义了p1对象且调用了构造方法（实例化p1）构造函数的主要
		Node n4=new Node(4);//作用是实例化A类，完成对象初始化
		Node n5=new Node(5);
		
		n1.next=n2;//对象.属性
		n2.next=n3;                            //Node n1=new Node();等号右边是对象，只不过没有给val，不写左边，直接写右边为匿名对象
		n3.next=n4;                            //构造对象语法：new 构造方法调用
		n4.next=n5;
		n5.next=null;
		return n1;
	}
	//头插(无论head是空链表还是非空列表都对)
	public static Node pushFront(Node head,int value) {
		//申请新结点
		Node newNode=new Node(value);//申请一个新结点，把100传入
		//更新newNode的next
        newNode.next=head;//当head为null时是对的，因为就算只有一个新的结点他的next也确实为null
		//head=newNode;//没用，形参变，实参不改变，没有影响
        return newNode;		
	}
	//找到链表的最后一个结点
	public static Node getlast(Node head){
		Node cur=head;
		while(cur.next!=null) { //在head为null的时候会出错，无法对null解引用
			cur=cur.next;//cur 指向了最后一个结点
		}
		return cur;
	}
	//尾插
	public static Node pushBack(Node head,int value) {
		if(head==null) {
			//跟头插一样处理  head会变化，本来指向null，后来指向新结点，所以返回值类型是Node
			return pushFront(head,value);
		}else{
			//申请新结点
		Node newNode=new Node(value); //如果head不为null时，尾插head不变化，可以不用返回，用void
		//找到当前链表的最后一个结点
		Node last=getlast(head);
		//让最后一个结点的next等于newNode 
		last.next=newNode;
		return head;
		}
	}
	//头删
	public static Node popFront(Node head) {
		if(head==null) {
			System.out.println("参数不合法，无法删除空链表中的结点");
			return null;//为空就已经返回了
		}
		return head.next; //不为空时
	}
	//尾删
	public static Node popBack(Node head) {
		if(head==null) {
			System.out.println("参数不合法，无法删除空链表中的结点");
			return null;
		}
		if(head.next==null) {
			//链表中只有一个结点
			//是为头删解决
			//释放最后一个结点（由GC负责）
			return null;
		}else{
			//找倒数第二个结点
			Node lastlast=getLastLast(head);
			//让倒数第二个结点直接指向空，释放最后一个结点
			lastlast.next=null;
			//返回首结点
			return head;
		}
		
	}
	public static Node getLastLast(Node head) {
		Node node=head;
		while(node.next.next!=null) {
			node=node.next;
			//node!=null,node最后指向null
			//node.next!=null,node 最后指向最后一个结点
			//node.next.next=null,node 最后指向倒数第二个结点
		}
		return node;
	}
	public static void main(String[] args) {
		Node head=createLinkedList();//创建一个链表
		displayLinkedList(head);
		head=pushFront(head,100);//头插100
		displayLinkedList(head);
		pushBack(head,666);
		displayLinkedList(head);
		
		head=null;
		displayLinkedList(head);
		head=pushBack(head,1);
		head=pushBack(head,2);
		head=pushBack(head,3);
		head=pushBack(head,4);
		head=pushBack(head,5);
		displayLinkedList(head);
		
		head=popFront(head);
		head=popFront(head);
		head=popFront(head);
		displayLinkedList(head);
		head=popBack(head);
		displayLinkedList(head);
		head=popBack(head);
		displayLinkedList(head);
	}
}