package Builder_Pattern;

public class Results {
    private final Car myFutureWifeCar;
    private final Car myCar;
    private final Car myFriendsCar;

    public Results() {
        myFutureWifeCar = new Car.CarBuilder()
                .setModel("BMW X7")
                .setEngine("V8")
                .setType("SUV")
                .setColor("White")
                .build();

        myCar = new Car.CarBuilder()
                .setModel("Tesla Model 3")
                .setEngine("Electric")
                .setType("Sedan")
                .setColor("Red")
                .build();

        myFriendsCar = new Car.CarBuilder()
                .setModel("Toyota Supra")
                .setEngine("3.0 Turbo")
                .setType("Coupe")
                .setColor("Black")
                .build();
    }

    public Car getMyFutureWifeCar() {
        return myFutureWifeCar;
    }

    public Car getMyCar() {
        return myCar;
    }

    public Car getMyFriendsCar() {
        return myFriendsCar;
    }
}
