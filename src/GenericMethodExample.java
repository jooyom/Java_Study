public class GenericMethodExample {
    public static void main(String[] args) {
        Rascal<Integer> rascal = Util.heee(100);
        //int intValue = rascal.get(rascal.t);
        System.out.println(rascal.get(rascal.t));

        Rascal<String> rascal2 = Util.heee("김광희");
        String strValue = rascal2.get(rascal2.t);
        System.out.println(strValue);
    }
}
