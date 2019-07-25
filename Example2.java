import java.util.*;
public class Example2{
	public static void main(String[] args) {
		double a,b,c;
		double p,q;
		double x1,x2;
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入一元二次方程的三个系数：");
		a=reader.nextDouble();
		b=reader.nextDouble();
		c=reader.nextDouble();
		p=-b/(2*a);
		q=Math.sqrt(b*b-4*a*c)/(2*a);
		x1=p+q;
		x2=p-q;
		System.out.println("一元二次方程的跟是：");
		System.out.printf("x1=%.2f,x2=%.2f\n",x1,x2);
	}
}