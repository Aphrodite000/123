class Employee {   //雇员类
	private String id;  //编号
	private String name; //姓名
	private int age;     //年龄
	private String vocation; //职务
	static int counter=0;
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
	public int 出勤人数(){  //用于得到出勤的人数
		return counter;  
	}
}
public class Example12 {
	public static void main (String[] args) {
		//声明对象数组并直接初始化，初始化元素直接调用构造方法创建对象
		Employee 雇员[]={new Employee("0001","张文军",50,"总经理"),
		new Employee("0005","李琦",50,"副经理"),
		new Employee("1016","张丽",50,"秘书")};
		
		for(Employee employee:雇员)
			employee.签到();
		
		System.out.println("今日出勤总人数（通过不同的途径得到）：");
		//可以通过任一一个雇员访问方法得到
		System.out.println("今日共有"+雇员[0].出勤人数()+"人出勤");
		System.out.println("今日共有"+雇员[2].出勤人数()+"人出勤");
		//也可以通过对象直接访问静态域
		//声明counter时，无访问限定词，所以同一包中可用对象名访问
		System.out.println("今日共有"+雇员[1].counter+"人出勤");
		//也可以通过类名访问静态域
		System.out.println("今日共有"+Employee.counter+"人出勤");
		//通过类名得到
	}
}