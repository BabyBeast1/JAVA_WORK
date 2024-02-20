package modifier;

class BirthDay {
	private int month;
	private int day;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if( 1 <= month && month <= 12) {
			this.month = month;
		}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if( 1 <= day && day <= 31) {
			this.day = day;
		}
	}
	
	
}
public class Lab7_BirthDay {

	public static void main(String[] args) {
		
		BirthDay bd = new BirthDay();
		
		bd.setMonth(12);
		bd.setDay(25);
		System.out.println(bd.getMonth() + "월 " + bd.getDay() + "일");
		bd.setMonth(13);
		bd.setDay(40);
		System.out.println(bd.getMonth() + "월 " + bd.getDay() + "일");
	}
}
