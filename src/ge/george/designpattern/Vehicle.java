package ge.george.designpattern;

public class Vehicle {

    private int speed;
    private String name;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public static class VehicleBuilder {
        private int speed;
        private String name;

        public VehicleBuilder name(String name) {
            this.name = name;
            return this;
        }

        public VehicleBuilder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(name, speed);
        }

    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }
}
