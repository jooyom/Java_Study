public class Main {
    public static void main(String[] args) {

        BOx box = new BOx();
        box.set("Hello");
        String str = (String) box.got();

        Box2<String> box2 = new Box2<String>();
        Box2<Integer> box3 = new Box2<Integer>();
        Box2<Double> box4 = new Box2<Double>();
        Box2<Test> box5 = new Box2<Test>();









        //box2.set("HI");
        //String str2 = box2.get();


    }
}