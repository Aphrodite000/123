//instanceof的用法
class Base {} //定义基类
class Derived extends Base{} //定义派生类
public class Example17{
	public static void main(String[] args) {
		Base base=null;
		//对象base没有表示Base类的实例对象
		Derived derived=null;
		//对象derived没有表示Derived类的实例对象
		if(base instanceof Base)
			//判断base是否是Base类实例对象
		    System.out.println("对象base是Base类的实例。");
		else
			System.out.println("对象base不是Base类的实例。");
		if(derived instanceof Base)
			//判断derived是否是Derived类实例对象
			System.out.println("对象derived是Base类及其子类的实例对象");
		else
			System.out.println("对象derived不是Base类及其子类的实例对象");
		base=new Base();//构造一个类的实例，创建对象，没有初始化
		derived=new Derived();
		System.out.println("对象derived和对象base都实例化后：");//都创建后
		
		//再判断
		if(base instanceof Base)
			//判断base是否是Base类实例对象
		    System.out.println("对象base是Base类的实例。");
		else
			System.out.println("对象base不是Base类的实例。");
		if(derived instanceof Base)
			//判断derived是否是Derived类实例对象
			System.out.println("对象derived是Base类及其子类的实例对象");
		else
			System.out.println("对象derived不是Base类及其子类的实例对象");
	}
}