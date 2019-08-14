class A {
	int val;
	public void setVarA(int v){
		val=v;
		//设置域值
	}
	public int getVarA(){
		return val;
		//获得域值
	}
}
class B extends A{
	private long val;
	public void setVarB(long v) {
		val=v;
		//设置域值
	}
	public long getVarB(){
		return val;
	}
}
public class Example20{
	public static void main(String[] args) {
		B b=new B();//创建对象b，b中有两个同名域var
		b.setVarA(1234567890);
		//调用继承自父类的方法设置继承自父类的var
		b.setVarB(12345678900L);
		//调用本身定义的方法设置本身定义的var
		System.out.println(b.getVarA());//输出继承自父类的var
		System.out.println(b.getVarB());//输出继承自子类的var
	}
}
