public class HouseDog extends Dog{
    void sleep(int hour){
        System.out.println(this.name + "Zzzzzzzzzzzzz...");
    }

    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("bb");
        houseDog.sleep();
    }
}
