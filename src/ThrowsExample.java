public class ThrowsExample {
    public static void main(String[] args) {
        try{
            divide(10,0);
        } catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
    public static int divide(int a, int b) {


        return a/b;

    }
}
