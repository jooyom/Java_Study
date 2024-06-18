public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Vehicle taxi = new Taxi();
        driver.drive(taxi);

        Vehicle bus = new Bus();
        driver.drive(bus);
    }
}
