package less1;

public class Task10 {

	public static void main(String[] args) {
		
		double x;
		double y;
		
		double rez;
		
		x=30;
		y=90;
		
		rez=(Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*(Math.tan(x*y));
		
		System.out.println(rez);
		
	}

}
