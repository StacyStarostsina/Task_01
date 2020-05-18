package by.stacy.les03.blabla;

public class Task13 {
	public static void task() {
		double x1;
		double x2;
		double x3;
		
		double y1;
		double y2;
		double y3;
		
		double ab;
		double ab1;
		double ab2;
		
		double ac;
		double ac1;
		double ac2;
		
		double bc;
		double bc1;
		double bc2;
		
		double p;
		double s;
		
		x1=2;
		x2=2;
		x3=3;
		
		y1=1;
		y2=0;
		y3=-1;
		
		ab1=Math.pow(x2-x1, 2);
		ab2=Math.pow(y2-y1, 2);
		ab=Math.sqrt(ab1+ab2);
		
		ac1=Math.pow(x3-x1, 2);
		ac2=Math.pow(y3-y1, 2);
		ac=Math.sqrt(ac1+ac2);		
		
		bc1=Math.pow(x3-x2, 2);
		bc2=Math.pow(y3-y2, 2);
		bc=Math.sqrt(bc1+bc2);
		
		p=ab+ac+bc;
		s=0.5*((x1-x3)*(y2-y3)-(y1-y3)*(x2-x3));
			
		System.out.println("Ответ на задачу №13 \nP = "+p);
		System.out.println("S = "+s+"\n");
	}
}
