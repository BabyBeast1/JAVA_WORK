package exam;
// 배열에 저장된 성적의 총합과 평균 구하기
public class Ex5_Array1 {

	public static void main(String[] args) {
		
		// 배열의 선언 및 생성 및 초기화
		int[] score = {66, 77, 88, 99, 100};
		
		int sum = 0;	// 총합
		
		// 배열 안 점수들의 총합 구하기
		for ( int i = 0; i < score.length; i++ ) {
			sum = sum + score[i];
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + ( sum / score.length));
		System.out.println("실수 평균 : " + (double)sum / score.length);
		
	}
}
