public class Calculator {
    public final double PI = 3.14159;

    double areaCircle (double r){
        System.out.println("Calculator 객체의 areaCirecle() 실행");
        return PI * r * r;
        // 와 오랜만에 봐서 헷갈림  void없어서 return 이 있어야해요
    }
}
