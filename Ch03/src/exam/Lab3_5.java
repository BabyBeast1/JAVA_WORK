package exam;

public class Lab3_5 {

	public static void main(String[] args) {

		int total = 681;
		int student = 7;
		
		double avg = (double)total / student;
		avg = avg*100;
		avg = Math.round(avg);
		avg = avg/100;
		
		System.out.println("반 평균은 " + avg + "점 입니다");

	}

}
