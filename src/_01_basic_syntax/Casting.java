package _01_basic_syntax;

import java.util.Scanner;

// 형변환
// - 데이터 타입 변환
// - (type) var
//    - type: 데이터 타입
//    - var: 변수명
public class Casting {
    public static void main(String[] args) {
        // 목시적 형변환 (Wider Conversion)
        // - 작은 타입에서 큰 타입으로 자동 형변환
        // - 반대의 경우에는 명시적으로 형변환해야 함
        int smallNumber = 10;
        double bigNumber = smallNumber; // int 를 double로 자동 형변환

        System.out.println("smallNumber: " + smallNumber);
        System.out.println("bigNumber: " + bigNumber);

        // 명시적 형변환 (Narrow Conersion)
        // - 더 큰 타입에서 작은 타입으로 강제 변환
        // - 주의) 큰 타입에ㅓ 작은 타입으로 강제 변환을 하다보니 데이터 손일이 날 수 있음
        double anotherBigNumber = 20.5;
        int anotherSmallNumber = (int) anotherBigNumber; // double 을 int 로 형변환
        System.out.println("smallNumber: " + anotherBigNumber);
        System.out.println("bigNumber: " + anotherSmallNumber);


        // 입력
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요");
        String name = sc.next(); // 공백 이전까지의 문자열 읽음
        System.out.println("나이를 입력하세요");
        int age = sc.nextInt(); // 공백 이전까지의 정수 읽기

        System.out.println("안녕하세요 ! " + name + "님" + "(" + age + "세)");
    }
}
