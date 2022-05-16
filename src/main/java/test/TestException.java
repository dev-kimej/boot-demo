package test;

public class TestException {

    public static void main(String[] args) {
        
        Test test = new Test();

        try {
            test.test("1", "ㅁ");
        } catch (NumberFormatException e) {
            System.out.println("입력한 값이 숫자가 아닙니다.........다다다다다다ㅏㅏㅏㅏㅏㅏㅏㅏ");
        }

    }
}

class Test {

    public void test(String a, String b) throws NumberFormatException {
        try {
            int sum = Integer.parseInt(a) + Integer.parseInt(b);    // 형변환 과정에서 NumberFormatException이 발생할거임
            System.out.println( a + " + " + b + " = " + sum + " 입니다.");
        } catch (NumberFormatException e) {
            System.out.println("숫자형 문자가 아닙니다. 형변환을 할 수가 없습니다.");
            throw e;
        }


    }
}
