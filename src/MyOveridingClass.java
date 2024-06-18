public class MyOveridingClass implements MyInterface{
    @Override
    public void abstractMethod() {
        System.out.println("Implementin gabstract method");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Overriding default method.");
    }
}
