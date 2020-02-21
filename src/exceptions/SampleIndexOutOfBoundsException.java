package exceptions;

public class SampleIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2};
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

        System.out.println("첫번째 숫자 : " + numbers[0]);
        try {
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스를 넘어갔습니다");
        }
        System.out.println("숫자의 개수 : " + numbers.length);

        System.out.println("==============================");

        System.out.println("시작");
        try {
            int i = 10;
            int x = Integer.parseInt(args[0]);
            System.out.println(i / x);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("파라미터가 입력되지 않았습니다" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식이 아닙니다." + e.toString());
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누지 마세요");
            e.printStackTrace();
        } finally {
            System.out.println("항상 호출");
        }
        System.out.println("끝");
    }
}
