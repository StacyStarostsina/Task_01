package by.stacy.les03.blabla;

public class Task24 {
	public static void task() {
		double a;
		double b;
		double c;
		double aa;
		double s;
		
		a=6;
		b=3;
		aa=1.5708;
		
		c=(a+b)*0.5;
		
		s=c*Math.sin(aa)*(a-c*Math.cos(aa));
		
		System.out.println("Ответ на задачу №24:\nS = "+s+"\n");
		
	}
}
