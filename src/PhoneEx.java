public class PhoneEx {
    public static void main(String[] args) {
        Phone phone =  new Phone();
        Smartphone smartphone = new Smartphone("김민철");

        smartphone.turnOff();
        smartphone.turnOn();
        smartphone.internetSearch();
    }
}
