public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10/0;
            //ArithmeticException예외 발생
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("정상적으로 종료되엇습니다.");
    }
}
