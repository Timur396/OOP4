package Drive;

import Transport.Transport;
import Transport.Truck;

public class C extends  Driver<Truck>{
    public C(String name, boolean license, Integer experience ) {
        super(name, license, experience);
    }

    @Override
    String start() {
        return "Грузовой автомобиль стартовал";
    }

    @Override
    String stop() {
        return "Грузовой автомобиль остановился";
    }

    @Override
    String refuel() {
        return "Грузовой автомобиль заправился";
    }

}
