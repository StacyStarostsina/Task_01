package by.stacy.les03.blabla;

public class Task29 {
	public static void task() {
		double a;
		double b;
		double c;
		
		double x;
		double y;
		double z;
		
		double alpha;
		double beta;
		double gamma;
		
		double alpha1;
		double beta1;
		double gamma1;
		
		
		a=5;
		b=6;
		c=10;
		
		x=(b*b+c*c-a*a)/(2*b*c);
		y=(a*a+c*c-b*b)/(2*a*c);
		z=(a*a+b*b-c*c)/(2*a*b);
		
		alpha=Math.acos(x);
		beta=Math.acos(y);
		gamma=Math.acos(z);
		
		
		alpha1=Math.toDegrees(alpha);
		beta1=Math.toDegrees(beta);
		gamma1=Math.toDegrees(gamma);
		
		System.out.println ("Ответ на задачу №29:\nЗначение углов в радианах:");
		System.out.println("  alpha = " +alpha);
		System.out.println("  beta = "+beta);
		System.out.println("  gamma = "+gamma);
		
		System.out.println("В градусах: ");
		System.out.println("  alpha ="+alpha1);
		System.out.println("  beta = "+beta1);
		System.out.println("  gamma = "+gamma1+"\n");
	}

}
