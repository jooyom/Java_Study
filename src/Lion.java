public class Lion extends Animal3 implements Predator, InTheZoo, ZooNumber{
    @Override
    public String getFood() {
        return "fish";
    }

    @Override
    public String where() {
        return "carnivore zone";
    }


    @Override
    public int num() {
        return 0;
    }


    public void lion(ZooNumber z){
        ZooNumber number = z;

    }

}
