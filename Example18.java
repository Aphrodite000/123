//给定两个整数，输出这两个数中的大数
import java.util.*;
public class Example18{
	public static void main(String[] args) {
		int a,b,max;
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入两个整数");
		a=reader.nextInt();
		b=reader.nextInt();
		
		if(a>b)
			max=a;
		else
			max=b;
		System.out.println("两个数中的大数是：");
		System.out.printf("max=%d\n",max);
	}
}