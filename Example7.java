//方法重载，计算两个同类型的数之和
public class Example7{
	public static void main(String[] args) {
		int a=15,b=15;
		System.out.println(a+"+"+b+"="+add(a,b));
		double x=1234.567,y=987.665;
		System.out.println(x+"+"+y+"="+add(x,y));
		long m=1234566788L,n=9876543210L;
		System.out.println(m+"+"+n+"="+add(m,n));
	}
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;
	}
	static long add(long a,long b) {
		return a+b;
	}
}