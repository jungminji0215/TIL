// 자바의 정석 기초 6 - 3

public class Exercise6_3 {
    public static void main(String[] args){
        Student s = new Student();
        s.name = "minji";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름: " + s.name);
        System.out.println("총점: " + s.getTotal());
        System.out.println("평균: " + s.getAverage());
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal(){
        int total = 0;
        total = kor + eng + math;
        return total;
    }

    // 해설 참고 함
    float getAverage(){
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }
}


/*
package Chapter6;

public class Exercise6_3 {
    public static void main(String[] args){
        Student s = new Student();
        s.name = "minji";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름: " + s.name);
        System.out.println("총점: " + s.getTotal());
        System.out.println("평균: " + s.getAverage());
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    // 기본 생성자
    Student(){};

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal(){
    	return kor+eng+math;
    }

    float getAverage(){
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }
}
*/


/*
소수 둘째자리에서 반올림

236 / 3 → 78
236 / 3f → 78.666664
236 / 3f * 10 → 786.66664
236 / 3f * 10 + 0.5 → 787.16664
(int)(236 / 3f * 10 + 0.5) → (int)787.16664 → 787
(int)(236 / 3f * 10 + 0.5) / 10 → 78
(int)(236 / 3f * 10 + 0.5) / 10f → 78.7
*/
