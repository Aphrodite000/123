public class Test {
	public static void main (String[] args) {
		System.out.println(add(5,5));
		myPrint(1);
		myPrint(2);
		myPrint(3);
		myPrint(4);
	}
	public static int add(int x,int y) {
		return x+y;
	}
	public static void myPrint(int x) {
		if(x==2) {
			return;
		}else {
			System.out.println(x);
		}
	}
}