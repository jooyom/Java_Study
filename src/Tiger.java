public class Tiger extends Animal3 implements Predator, InTheZoo{
    @Override
    public String getFood() {
        return "meat";
    }

    @Override
    public String where() {
        return "carnivore zone";
    }

}
