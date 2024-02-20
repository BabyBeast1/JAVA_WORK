/* Time 클래스 캡슐화하기 */
package modifier;

public class Time {

	// field
	private int hour;	// 클래스 내부에서만 접근 허용 => 캡슐화
	private int min;
	
	// setter, getter 메소드를 public으로 제공
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(0 <= hour && hour <=23 ) {	// 유효한 값일 때만 setting 
			this.hour = hour;
		}
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		if(0 <= min && min <= 59 ) {
			this.min = min;
		}
	}	
	
}
