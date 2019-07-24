import java.util.*;   
public class Example {
	public static void main(String[] args) {
		double average;//平均数
		int number=10;//学生数
		int score,sum=0;//成绩与成绩总和
		//用标准输入流类的对象System.in创建Scanner类的对象
		Scanner input=new Scanner(System.in);
		for(int c=0;c<number;c++) { //用循环输入十个学生的成绩
			score=input.nextInt();
			sum+=score;
		}
		average=sum/number;  //计算平均成绩
		System.out.printf("Average score=%.2f\n",average);
	}
}