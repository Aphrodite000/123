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
public class Example11 {
	public static void main(String[] args) {
		//先创建3个雇员对象
		Employee employee1=new Employee("0001","张文军",50,"总经理");
		Employee employee2=new Employee("0005","李琦",45,"副经理");
		Employee employee3=new Employee("1016","张丽",28,"秘书");
		//声明对象数组并直接初始化
		Employee 雇员1[]={employee1,employee2,employee3};
		output(雇员1);//输出雇员信息
		System.out.println("------------------");//分割线
		//声明对象数组并直接初始化，初始化元素直接调用
		//构造方法创建对象
		Employee 雇员2[]={new Employee("0001","张文军",50,"总经理"),
		new Employee("0005","李琦",45,"副经理"),
		new Employee("1016","张丽",28,"秘书")};
		output(雇员2);
	}
	//定义方法用于输出雇员信息，注意方法是private,static
	private static void output(Employee 雇员[]){
		for(Employee employee:雇员)
			System.out.println(employee.toString());
	}
}