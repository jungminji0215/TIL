//자바의 정석 기초 6-6

class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x, int y) {
		
		return Math.sqrt(((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y)));
	}
}

public class Exercise6_6 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		
		System.out.println(p.getDistance(2, 2));
	}

}
