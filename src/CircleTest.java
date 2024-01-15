class Circle {
    private double radius;

    // 생성자
    public Circle(double radius) {
        this.radius = radius;
    }

    // 반지름 getter
    public double getRadius() {
        return radius;
    }

    // 원의 면적 계산
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// CircleTest 클래스
class CircleTest {
    public static void main(String[] args) {
        // 반지름이 5인 Circle 객체 생성
        Circle myCircle = new Circle(5);

        // 원의 반지름과 면적 출력
        System.out.println("원의 반지름: " + myCircle.getRadius());
        System.out.println("원의 면적: " + myCircle.getArea());
    }
}