public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.brand = "BMW";
        car.model = "X5";
        car.year = 2022;

        Engine engine = new Engine();
        engine.volume = 3.0;
        engine.numOfCylinders = 6;
        engine.typeOfFuel = "gas";
    }
}