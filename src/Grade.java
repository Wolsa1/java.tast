public class Grade {
    private int eng;
    private int math;
    private int kor;

    public void initGrade(int eng, int math, int kor) {
        this.eng = eng;
        this.math = math;
        this.kor = kor;
    }

    public double getAvg() {
        return (eng + math + kor) / 3.0;
    }

    public String getGrade() {
        double avg = getAvg();

        if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Grade grade = new Grade();
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("값확인 " + grade.eng + grade.math + grade.kor);
        grade.initGrade(90, 70, 60);

        System.out.println(grade.getAvg());
        System.out.println(grade.getGrade());
    }
}