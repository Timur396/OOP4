package Drive;

import Transport.Transport;
import Transport.Truck;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
