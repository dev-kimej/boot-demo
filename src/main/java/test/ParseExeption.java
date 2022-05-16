package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ParseExeption {

    public static void main(String[] args) {

        IntTypeClass intTypeClass = new IntTypeClass();

//        Scanner scanner = new Scanner(System.in);
        TestScanner testScanner = new TestScanner();

        intTypeClass.multiply(testScanner.input());
    }

}

class IntTypeClass {

    public void multiply(int a) {
        System.out.println("입력하신 " + a + "의 2제곱은 " + (a * a) + " 입니다.");
    }

}

class TestScanner {
    Scanner scanner = new Scanner(System.in);
    int a = 0;

    public int input() {

        try {
            a = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("숫자로 다시 입력해주세요.");
            scanner.next();
            input();
        }

        return a;
    }
}