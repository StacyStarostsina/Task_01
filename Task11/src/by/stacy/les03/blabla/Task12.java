package by.stacy.les03.blabla;

public class Task12 {
	public static void task() {
		double x1;
		double x2;
		double y1;
		double y2;
		
		double diff1;
		double diff2;
		double diff;
		
		x1=3;
		x2=5;
		
		y1=4;
		y2=5;
		
		diff1=Math.pow(x2-x1, 2);
		diff2=Math.pow(y2-y1, 2);
		
		diff=Math.sqrt(diff1+diff2);
		
		System.out.println("Ответ на задачу №12: \nРасстояние между точками "+diff+"\n");
	}

}
