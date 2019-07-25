public class Example5 {
	public static void main(String[] args) {
		int n=8;
		long f;
		f=fac(n);//调用fac()计算8！
		System.out.printf("%d!=%d\n",n,f);
		System.out.println(fac(5));
	}
	//fac方法。递归方法
	static long fac(int n) {
		if(n>1)
			return n*fac(n-1);
		//计算n！
		else
			return 1;
		//1！
	}
}