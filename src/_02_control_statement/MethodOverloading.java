package _02_control_statement;

public class MethodOverloading {
    public static void main(String[] args) {
        // 1. 객체 생성
        MethodOverloading ol = new MethodOverloading();

        // 2. 객체의 메소드 사용
        System.out.println(ol.add(1, 2));
        System.out.println(ol.add(10.0, 20.8));
        System.out.println(ol.add(1, 4, 6));

        operations(10, 3);

        System.out.println("반지름이 5인 원의 넓이: " + ol.circleArea(5));
        System.out.println("가로 4, 세로 7인 직사각형의 넓이: " + ol.squareArea(4, 7));
        System.out.println("밑변 6, 높이 3인 삼각형의 넓이: " + ol.triangleArea(6, 3));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    // 실습
    public static void operations(double a, double b) {
        System.out.println("덧셈 결과 : " + (a + b));
        System.out.println("뺄셈 결과 : " + (a - b));
        System.out.println("나눗셈 결과 : " + (a / b));
        System.out.println("곱셈 결과 : " + (a * b));
    }

    public double circleArea(double r) {
        return Math.pow(r, 2) * Math.PI;
    }

    public double squareArea(double w, double h) {
        return w * h;
    }

    public double triangleArea(double w, double h) {
        return w * h / 2;
    }
}
