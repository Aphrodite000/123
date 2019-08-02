//求圆周率近似值
public class Example13{
	public static void main(String[] args) {
		int i=1,sign=1;
		double item,pi=0;
		
		do{
			item=sign*1.0/i;
			pi=pi+item;
			i+=2;
			sign=-sign;
		}while(Math.abs(item)>1.0E-6);
		pi=4*pi;
		System.out.printf("PI=%.6f\n",pi);
	}
}