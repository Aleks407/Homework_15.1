public class Main {
    public static void main(String[] args) {
        Car[] car = {
                new Car("Car1", 4),
                new Car("Car2", 4)

        };
        Truck[] truck = {
                new Truck("Truck1", 6),
                new Truck("Truck2", 8)
        };

        Bicycle[] bicycle = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };

        Transport[] transport = new Transport[car.length + truck.length + bicycle.length];
        for (int i = 0; i < car.length; i++) {
            transport[i] = car[i];
        }
        for (int i = 0; i < truck.length; i++) {
            transport[i + car.length] = truck[i];
        }
        for (int i = 0; i < bicycle.length; i++) {

            transport[i + car.length + truck.length] = bicycle[i];
        }

        PrintServiceStation station = new PrintServiceStation();
        station.check(transport);

    }
}