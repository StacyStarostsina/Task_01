package less1;
// (80/n+12)*m
public class Task6 {
	public static void main(String[] args ) {
		int n;
		int m;
		
		double rez;
		double temp1;
		//double temp2;
		
		n=15;
		m=10;
		
		temp1 = (double) 80/n; //количество молока в одном маленьком бидоне
		rez = (temp1+12)*m;
		
		System.out.println(rez+" литров молока в "+m+" больших бидонах");
		
	}

}
