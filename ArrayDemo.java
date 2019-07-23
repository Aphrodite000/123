public class ArrayDemo {
	public static void main (String[] args) {
		int[] x=null;
		int[] temp=null;//声明对象、
		x=new int[3];
		System.out.println(x.length);
		x[0]=1;
		x[1]=2;
		x[2]=3;
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
			//通过循环控制索引下标更改
		}
		temp=x;//如果要发生引用传递，不要出现[]
		temp[0]=55;//修改数据
		System.out.println(x[0]);
	}
}