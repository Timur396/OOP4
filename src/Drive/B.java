package Drive;

import Transport.Bus;

public class B <T extends Bus> extends Driver{
    public B(String name, boolean license, Integer experience) {
        super(name, license, experience);
    }

    @Override
    String start() {
        return "Автобус автомобиль стартовал";
    }

    @Override
    String stop() {
        return "Автобус автомобиль остановился";
    }

    @Override
    String refuel() {
        return "Автобус автомобиль заправился";
    }
}
