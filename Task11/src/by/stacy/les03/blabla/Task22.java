package by.stacy.les03.blabla;

public class Task22 {
	public static void task() {
		double t;
		int s;
		double m;
		double h;
		
		t=5000;
		
		h=(int)t/(3600);
		m=(int)(t-h*3600)/60;
		s=(int)t%60;
		
		System.out.println("Ответ на задачу №22:\nВремя:"+h+"ч "+m+"мин "+s+"с"+"\n");
		
		
	}
}
