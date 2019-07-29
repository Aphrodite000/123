class Point {   //点类
	private int x,y;   //点的位置
	public  Point(int x,int y) { //构造方法，用一对坐标值构造
		this.x=x;
		this.y=y;
	}
	public Point(Point p) {
		x=p.x;       //构造方法，用本身类对象构造
		y=p.y;
	}
	public int getX(){
		return x;  //获得x分量
	}
	public int getY() {
		return y;  //获得y分量
	}
	//移动点的方法，x和y的增量分别是offsetX和offsetY
	public void move(int offsetX,int offsetY){
		x=x+offsetX;
		y=y+offsetY;
	}
}
class Circle{           //组合类
	private double radius;
	private Point center;  //Point类的对象
	
	//构造方法，用点坐标（x，y）构造圆对象
	public Circle (double radius,int x,int y) {
		this.radius=radius;
		center=new Point(x,y);
	}
	//构造方法，用点类的对象构造圆对象
	public Circle (double radius,Point p) {
		this.radius=radius;
		center=new Point(p);
	}
	//计算圆面积
	public double area(){
		return Math.PI*radius*radius;
	}
	//计算圆周长
	public double perimeter(){
		return Math.PI*2*radius;
	}
	//获取圆心x坐标
	public int getCenterX() {
		return center.getX();//直接调用点类中的方法获取
	}
	//获取圆心y坐标
	public int getCenterY() {
		return center.getY();//直接调用点类中的方法获取
	}
	//移动圆
	public void move(int offsetX,int offsetY) {
		center.move(offsetX,offsetY);
	}
}
public class Example10 {
	public static void main(String[] args) {
		int x=15,y=25;
		double radius =10;
		Circle a=new Circle(radius,x,y);
		System.out.printf("a的面积是：%.2f,",a.area());
		System.out.printf("a的周长是：%.2f\n",a.perimeter());
		
		System.out.print("移动前a的位置：");
		System.out.println("("+a.getCenterX()+","+a.getCenterY()+")");
		a.move(11,12);//移动圆
		System.out.print("移动后a的位置；");
		System.out.println("("+a.getCenterX()+","+a.getCenterY()+")");
		
		Point p=new Point(-15,-25);  //创建一个点类的对象
		radius=15;
		Circle b=new Circle(radius,p);
		System.out.printf("b的面积是：%.2f,",b.area());
		System.out.printf("b的周长是：%.2f\n",b.perimeter());
		
		System.out.print("移动前b的位置：");
		System.out.println("("+b.getCenterX()+","+b.getCenterY()+")");
		b.move(-11,-12);//移动圆
		System.out.print("移动后b的位置；");
		System.out.println("("+b.getCenterX()+","+b.getCenterY()+")");
	}
}