package examEnum;

import java.util.Calendar;

enum Gender {MALE, FEMALE}

public class Ex13_DayOfWeek {

	public static void main(String[] args) {
		
		DayOfWeek today = null; 	// 참조형이므로 null로 초기화 가능
		// DayOfWeek에 있는 상수값만 저장 가능하다.
//		today = Gender.MALE;	// 다른 열거형 타입 저장 불가능. error
		
		// 날짜와 시간 정보를 얻을 때 사용. 추상 클래스
		// 나라마다 지역마다 날짜와 시간을 계산하는 방법은 다를 수 있다. --> new로 객체 생성 불가능
		// getInstance() : 컴퓨터에 설정되어 있는 시간대를 기준으로 달력 객체를 얻어온다.
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DAY_OF_WEEK);	// 오늘의 요일을 정수값으로 반환(1(일요일) ~ 7)
		int month = cal.get(Calendar.MONTH);	// 현재의 월을 정수값으로 반환. 1월 (0)
		int year = cal.get(Calendar.YEAR);	// 현재의 년도 반환
		
		System.out.println(year + " " + month + " " + day);
		
		switch(day) {
		case 1: 
			today = DayOfWeek.SUNDAY;
			break;
		
		case 2: 
			today = DayOfWeek.MONDAY;
			break;
			
		case 3: 
			today = DayOfWeek.TUESDAY;
			break;
			
		case 4: 
			today = DayOfWeek.WEDNESDAY;
			break;
			
		case 5: 
			today = DayOfWeek.THURSDAY;
			break;
			
		case 6: 
			today = DayOfWeek.FRIDAY;
			break;
			
		case 7: 
			today = DayOfWeek.SATURDAY;
			break;
		}
		System.out.println("오늘의 요일 : " + today);
		
		switch(today) {
		case DayOfWeek.SATURDAY: // 상수이름만 사용
		case SUNDAY:
			System.out.println("오늘은 주말이네요");
			break;
			default: 
				System.out.println("평일이면 열심히 공부해야죠!");
		}
		
		System.out.println(today.name());
		System.out.println(today.ordinal());
	}
}
