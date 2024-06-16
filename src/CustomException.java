import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomException extends Exception{
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("첫 번째 숫자를 입력하세요.");
                int a = scanner.nextInt();
                System.out.println("두 번째 숫자를 입력하세요.");
                int b = scanner.nextInt();
                System.out.println(a / b);
                return;
            } catch (InputMismatchException e) {
                System.out.println("올바른 숫자를 입력하세요.");
            } catch (ArithmeticException ex){
                System.out.println("0으로 나눌 수 없습니다.");
            }
        }
    }
}
