//设计一个雇员类，并创建雇员类的对象数组，输出每个雇员的信息
class Employee {   //雇员类
	private String id;  //编号
	private String name; //姓名
	private int age;     //年龄
	private String vocation; //职务
	public Employee(){} //构造方法一
	public Employee(String id,String name,int age,String vocation){
		set(id,name,age,vocation);
	}
	//设置属性的方法
	public void set(String id,String name,int age,String vocation){
		this.id=id;
		this.name=name;
		this.age=age;
		this.vocation=vocation;
	}
	public String toString() {
		String mess=id+","+name+","+age+","+vocation;
		return mess;
	}
}
public class Example4  {
	public static void main(String[] args) {
		Employee 雇员[]=new Employee[3];
		int i;
		for(i=0;i<雇员.length;i++)//为对象数组中每一个元素实例化
		雇员[i]=new Employee();//如果没有写构造方法一，而这样写，会出错
		//因为类中有有参的构造方法，系统就不会在默认给无参的构造方法了，
		//所以当类中写了有参的构造方法后，要用无参的构造方法时必须写出来
		
		//每一个对象元素分别初始化
		雇员[0].set("0001","张文军",50,"总经理");
		雇员[1].set("0002","李琦",45,"副经理");
		雇员[2].set("1016","张丽",28,"秘书");
		for (Employee employee:雇员)
			System.out.println(employee.toString());
	}
}