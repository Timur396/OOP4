package Drive;

import Transport.PassengerCar;

public class A<T extends PassengerCar> extends Driver{
    @Override
    String start() {
        return "Легковой автомобиль стартовал";
    }

    @Override
    String stop() {
        return "Легковой автомобиль остановился";
    }

    @Override
    String refuel() {
        return "Легковой автомобиль заправился";
    }

    public A(String name, boolean license, Integer experience) {
        super(name, license, experience);

    }

}
