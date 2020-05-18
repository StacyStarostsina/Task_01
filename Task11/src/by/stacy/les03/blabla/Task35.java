package by.stacy.les03.blabla;

public class Task35 {
	public static void task() {
		double res;
		double n;
		double m;
		double old;
		double yg;

		m = 4663;
		n = 22;

		res = m / n;
		//System.out.println(res); 
		yg = res % 10;
		yg = (int) yg;
		System.out.println("Младшая цифра целой части " + yg);
		res = res * 10;
		res = (int) res;

		old = res % 10;
		System.out.println("Старшая цифра дробной части " + old);

	}

}
