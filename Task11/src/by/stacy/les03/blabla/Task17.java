package by.stacy.les03.blabla;

public class Task17 {
	public static void task() {
		double a;
		double b;
		
		double ph;
		double g1;
		double g;
		
		a=3;
		b=5;
		
		ph=(Math.pow(a, 3)+Math.pow(b, 3))/2;
		
		g1=Math.abs(a)*Math.abs(b);
		g=Math.pow(g1, 0.5);
		
		System.out.println("Ответ на задачу №17:\nСреднее арифметическое кубов чисел:"+ph);
		System.out.println("Cреднее геометрическое модулей чисел: "+g+"\n");
	}
}
