//找出两个整型数，三个整型数或四个整型数中的最大值
public  class Example8{
	public static void main(String[] args){
		int a=25,b=-30,c=12,d=45;
		int m;
		m=max(a,b);
		System.out.println("两个数中的最大值是："+m);
		m=max(a,b,c);
		System.out.println("三个数中的最大值是："+m);
		m=max(a,b,c,d);
		System.out.println("四个数中的最大值是："+m);
	}
	static int max(int a,int b) {
		if(a>b) {
			return a;
		}else
			return b;
	}
	static int max(int a,int b,int c) {
		int d=max(a,b);
		int e=max(c,d);
		return e;
	}
	static int max(int a,int b,int c,int d) {
		int e=max(a,b,c);
		int f=max(d,e);
		return f;
	}
}