public class MultipleClass implements Interface1, Interface2{

    @Override
    public void defaultMethod() {
        Interface1.super.defaultMethod();
    }
}
