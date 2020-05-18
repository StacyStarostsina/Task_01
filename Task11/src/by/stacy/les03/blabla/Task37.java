package by.stacy.les03.blabla;

public class Task37 {
	public static void task() {
		int x;
		
		int a;
		int a1;
		int a2;
		int a3;
		
		int b;
		int b1;
		int b2;	
		
		int x1;
		int n;
		int m;
				
		int c;
		double c1;
		double c2;
		double c3;
		//1
		x = 52;
		if ((x % 2 == 0) && (x / 2 <= 49) && (x / 2 >= 5)) {
			System.out.println("true");
		}

		else {
			System.out.println("false");
		}
		
		
		//2
		a=2;
		a1=4;
		a2=5;
		a3=4;
		
		if((a+a1)==(a2+a3)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		//3
		b=4;
		b1=6;
		b2=8;
		
		if((b+b1+b2)%2==0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		

		//4
		x1=7;
		m=34;
		n=2;
		
		if (x1>=n && x1<=m) {
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		
		//5

		
		c=234;
		c1=2;
		c2=3;
		c3=4;
		
		if((c*c)==(Math.pow((c1+c2+c3), 3))){
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		//6
		
		int d;
		int d1;
		int d2;
		
		d=3;
		d1=123;
		d2=3;
		
		if (d==d1 || d==d2 || d1==d2) {
			System.out.println("true");
			
		}
		else {
			System.out.println("false");
		}

		//7
		int e;
		int e1;
		int e2;
		
		e=2;
		e1=7;
		e2=5;
		
		if((e+e1)==e2||(e+e2)==e1||(e1+e2)==e) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		//8
		
		double f;
		double f1;
		double f2;
		
		f=8;
		f1=2;
		f2=3;
		
		if ((Math.pow(f1, f2)==f)){
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		//9
		
		int g;
		int g1;
		int g2;
		int g3;
		
		g=3; //x
		g1=2; //y
		g2=4; //m
		g3=2; //n

		if(g==g2 && g1==g3) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}
}
