
package Transport;

import Drive.B;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Truck extends Transport implements Competing{
    private final Integer pitStopTime;
    private final Integer maxSpeed;
    private final Set<Mechanic<Truck>> mechanics;
private B driver;
    private final Integer bestLapTime;

    public Truck(String make,
                 String model,
                 double engineCapacity,
                 Integer pitStopTime,
                 Integer maxSpeed,
                 Integer bestLapTime,
                 B driver, Mechanic<Truck>... mechanics) {
        super(make, model, engineCapacity);
        this.mechanics = new HashSet<>(Arrays.asList(mechanics));
        setDriver(driver);
        this.bestLapTime = Validate.validateNumber(bestLapTime);
        this.pitStopTime = Validate.validateNumber(pitStopTime);
        this.maxSpeed = Validate.validateNumber(maxSpeed);
    }
    @Override
    public boolean service() {
        return Math.random()>0.75;
    }

    @Override
    public void repair() {

    }
    @Override
    void startMove() {
        System.out.println(" Грузовик начал движение");
    }
    @Override
    void stopMove() {
        System.out.println(" Грузовик начал движение");
    }
    @Override
    public void getPitStop() {
        System.out.println(" Пит стоп:"+pitStopTime);
    }
    @Override
    public void getBestTime() {
        System.out.println(" Лучшее время" +bestLapTime);

    }
    @Override
    public void getMaxSpeed() {
        System.out.println(" Максимальная скорость"+ maxSpeed);

    }

    public void setDriver(B driver) {
        this.driver = driver;
    }
    @Override
    public String toString() {
        return "Грузовик с водителем"+ driver+ "\n"+super.toString();
    }
}



