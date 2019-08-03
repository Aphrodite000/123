class Employee {   //雇员类
	private String id;  //编号
	private String name; //姓名
	private int age;     //年龄
	private String vocation; //职务
	private static int counter;//静态成员，没有赋初值，私有域
	static {
		counter=10;
		//初始化为0，非静态域不能在静态初识化器中初始化
	}
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
	public void 签到(){
		System.out.println(name+"签到");
		counter++;
		//每签到一人，计数器加一
	}
	public static int 出勤人数(){  //用于得到出勤的人数
		return counter;  
	}
}
public class Example15 {
	public static void main(String[] args){
		//声明对象数组并直接初始化，初始化元素直接调用构造方法创建对象
		Employee 雇员[]={new Employee("0001","张文军",50,"总经理"),
		new Employee("0005","李琦",50,"副经理"),
		new Employee("1016","张丽",50,"秘书")};
		for(Employee employee:雇员)
			employee.签到();
		System.out.print("今日出勤总人数");
		//通过类名访问静态方法
		System.out.println("今日共有"+Employee.出勤人数()+"人出勤");
	}
}