public class ImplementsC implements InterfaceC{

    @Override
    public void methodC() {
        System.out.println("C메소드 실행");
    }

    @Override
    public void methodA() {
        System.out.println("A메소드 실행");
    }

    @Override
    public void methodB() {
        System.out.println("B메소드 실행");
    }
}
