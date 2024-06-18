public class InterfaceInheritExample {
    public static void main(String[] args) {
        ImplementsC implC = new ImplementsC();

        InterfaceA interA = implC;
        interA.methodA(); //A메소드 실행
        System.out.println("=============");

        InterfaceB interB = implC;
        interB.methodB(); //B메소드 실행
        System.out.println("==============");

        InterfaceC interC = implC;
        interC.methodA(); //A메소드 실행
        interC.methodB(); //B메소드 실행
        interC.methodC(); //C메소드 실행


    }
}
