public class ThrowTest {
    public static void main(String[] args) {
        int n1, n2;

        n1 = 12;
        n2 = 0;

        try {
            throwTest(n1, n2);
        }catch (ArithmeticException e) {
            System.out.println("ArithemticException " + e.getMessage());
        }
    }
    public static void throwTest(int a, int b)  throws ArithmeticException{
        throw new ArithmeticException();
    }
}
