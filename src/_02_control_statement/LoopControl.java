package _02_control_statement;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopControl {
    public static void main(String[] args) {

        // while 문
        // - 조건식이 참일 동안 while 블럭 실행
//        int i = 1;
//        while(i <= 10) {
//            System.out.print(i + " ");
//            i++;
//        }
//
//        // do-while 문
//        // - do 블럭이 먼저 실행 (적어도 한번은 수행되는 반복문)
//        int j = 1;
//        do {
//            System.out.print(j + " ");
//            j++;
//        } while(j <= 10);
//        System.out.println();
//
//        // for ~ each 문
//        // - callection type 데이터에서 사용 가능
//        // * callection type: 데이터를 저장하고 관리하는 자료구조를 제공하는 클래스 모음
//        // ex. List, Vactor 등
//        String[] arr = {"A", "B", "C", "D"};
//        for (String a : arr) {
//            System.out.println("a = " + a);
//        }

//        List<String> list = new ArrayList<String>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        for (String l: list) {
//            System.out.println("l = " + l);
//        }





        /////////// 실습
        // String 객체 비교
        System.out.println("숫자를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 1;
        do{
            System.out.print(i + " ");
            i++;
        }while(i <= number);
    }
}
