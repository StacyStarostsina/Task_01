package less1;

public class Task8 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		double rez;
		
		double temp1;
		double temp2;
		double temp3;
		
		a=87;
		b=12;
		c=50000;
	
		temp1 = b+Math.sqrt(b*b+4*a*c);
		temp2 = temp1/(2*a);
		temp3=temp2-Math.pow(a, 3)*c;
		
		rez = temp3+Math.pow(b, -2);
		
		System.out.println(rez);
		}

}
