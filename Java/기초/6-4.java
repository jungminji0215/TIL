// 자바의 정석 기초 6 - 4 

public class Exercise6_4 {

	static double getDistance(int x, int y, int x1, int y1) {
		double temp = ((x - x1) * (x - x1)) + ((y - y1) * (y - y1));

		double distance = Math.sqrt(temp);
		return distance;
	}

	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
}

/*
Math 클래스에서 알아두면 좋은 함수

- sqrt(souble a) 👉 제곱근 계산
- pow(double a, double b) 👉 제곱 함수
*/
