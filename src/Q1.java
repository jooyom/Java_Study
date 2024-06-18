import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("첫 번째 숫자를 입력하세요");
            int a, b;
            a = scanner.nextInt();
            System.out.println("두 번째 숫자를 입력하세요");
            b = scanner.nextInt();
            System.out.println("나눗셈을 결과: " + a/b);
        } catch (ArithmeticException e){
            System.out.println("두 번째 숫자가 0입니다.");
        }

    }
}
