//写圆类，计算半径10和15的两个圆的面积和周长
class Circle{
	double radius;  //域(属性)，半径
	//没写构造方法，系统默认了无参的构造方法
	void setRadius(double r) {
		radius=r;
	}
	double area() {
		return Math.PI*radius*radius;
		//Math是java中的一个类，其静态域PI表示圆周率
	}
	double perimeter(){
		return 2*Math.PI*radius;
	}
}
public class Example9{
	public static void main(String[] args) {
		double area,perim;
		Circle circle=new Circle();//声明和创建对象
		circle.setRadius(10);//设置圆半径
		area=circle.area(); //计算圆的面积
		perim=circle.perimeter();//计算圆的周长
		System.out.printf("area:%.2f%n",area);//保留两位小数
		System.out.printf("perimeter:%.2f%n",perim);
		
		circle=new Circle();//创建新对象，原对象丢失
		circle.setRadius(15);
		area=circle.area();
		perim=circle.perimeter();
		System.out.printf("area:%.2f%n",area);//保留两位小数
		System.out.printf("perimeter:%.2f%n",perim);
	}
}