package by.stacy.les03.blabla;

public class Task38 {
	public static void task() {
		//a
		int x;
		int y;
		
		x=2;
		y=1;
		
		if (x>=-4||x<=4||y>=0||y<=4) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}
	
	public static void taskB() {
		int x;
		int y;
		
		x=-4;
		y=3;
		
		if ((x>=-4 && x<=4)&&(y>=-3)&&(y<=4)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	
	public static void taskC() {
		double x1;
		double y1;
		double r1;
		double ymax1;
		
		double x2;
		double y2;
		double r2;
		double ymax2;
		
		r1=5;
		x1=2;
		y1=4;
		ymax1=-Math.sqrt(r1*r1-x1*x1);
		
		r2=4;
		x2=3;
		y2=2;
		ymax2=Math.sqrt(r2*r2-x2*x2);
		
		if(x1>=0 && x1<=r1 && y1<=0 && y1>=ymax1 && x2>=0 && x2<=r2 && y2>=1 && y2<=ymax2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
