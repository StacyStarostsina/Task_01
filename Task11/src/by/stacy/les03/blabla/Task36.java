package by.stacy.les03.blabla;

public class Task36 {
	public static void task() {
		int x;
		int y;
		int d;
		int z;

		int ch;
		int nch;
		
		x=4;
		y=2;
		z=5;
		d=7;
		ch=1;
		nch=1;

		
		if (x%2==0) {
			ch=ch*x;
			}
		else {
			nch=nch*x;
		}
		
		if (y%2==0) {
			ch=ch*y;
			}
		else {
			nch=nch*y;
		}	
		
		if (z%2==0) {
			ch=ch*z;
			}
		else {
			nch=nch*z;
		}
		if (d%2==0) {
			ch=ch*d;
			}
		else {
			nch=nch*d;
		}
		System.out.println("Произведение четных чисел "+ch);
		System.out.println("Произведение нечетных чисел "+nch);
	}
}
