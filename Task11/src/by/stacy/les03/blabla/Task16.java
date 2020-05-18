package by.stacy.les03.blabla;

public class Task16 {
	public static void task() {
		int num;
		
		int a1;
		int a2;
		int a3;
		int a4;
		
		int rez;
		
		num=3764;
		
		a1=num%10;
		a2=num%100/10;
		a3=num%1000/100;
		a4=num%10000/1000;
		
		rez=a1*a2*a3*a4;
		
		System.out.println
		("Ответ на задачу №16:\nПроизведение четырёх цифр заданного числа равно:"+rez+"\n");
	}
}
