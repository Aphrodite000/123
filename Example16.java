//continue语句
//从键盘输入若干个整数，其中不能被3整除的数累加在一起，并输出其和
//当输入负数时结束
import java.util.*;
public class Example16{
	public static void main(String[] args) {
		int sum=0,x;
		Scanner reader=new Scanner(System.in);
		while((x=reader.nextInt())>0){
			if(x%3==0)
				continue;
			
			sum=sum+x;
		}
		System.out.println("sum="+sum);
	}
}