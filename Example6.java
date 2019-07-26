public class Example6{
	public static void main (String[] args) {
		System.out.println("第20个Fibonacci数："+fib(20));
		//用+将一个字符串和一个数值连接成一个字符串后作为println()的参数
	}
	//定义fib
	static int fib (int n){
		if(n>2)//前两个之和
			return fib(n-1)+fib(n-2);//递归调用
		else
			return 1;
	}
}