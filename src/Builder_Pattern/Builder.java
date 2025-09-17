package Builder_Pattern;

class Car {
    private final String model;
    private final String engine;
    private final String type;
    private final String color;

    private Car(CarBuilder builder) {
        this.model = builder.model;
        this.engine = builder.engine;
        this.type = builder.type;
        this.color = builder.color;
    }


    @Override
    public String toString() {
        return "Model: " + model + ", Engine: " + engine + ", Type: " + type + ", Color: " + color;
    }

    public static class CarBuilder {
        private String model;
        private String engine;
        private String type;
        private String color;

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}

public class Builder  {
    public static void main(String[] args) {
        Results results = new Results();

        System.out.println(results.getMyFutureWifeCar());
        System.out.println(results.getMyCar());
        System.out.println(results.getMyFriendsCar());
    }
}
