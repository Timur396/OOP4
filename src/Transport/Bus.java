package Transport;

import Drive.C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public  class Bus extends Transport implements Competing {
    private final Integer pitStopTime;
private C driver;
    private final Integer maxSpeed;
    private final Integer bestLapTime;
    private final Set<Mechanic<Bus>> mechanics;
    public Bus(String make,
               String model,
               double engineCapacity,
               Integer pitStopTime,
               Integer maxSpeed,
               Integer bestLapTime,
               C driver, Mechanic <Bus>...mechanics) {
        super(make, model, engineCapacity);
        this.bestLapTime = Validate.validateNumber(bestLapTime);
        this.pitStopTime = Validate.validateNumber(pitStopTime);
        this.maxSpeed = Validate.validateNumber(maxSpeed);
        this.mechanics = new HashSet<>(Arrays.asList(mechanics));
        setDriver(driver);
    }

    @Override
    public boolean service() {
        return false;
    }

    @Override
    public void repair() {

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
    @Override
    void startMove() {
        System.out.println(" автобус начал движение");

    }
    @Override
    void stopMove() {
        System.out.println(" автобус закончил движение");
    }

    public void setDriver(C driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Автобус с водителем"+ driver+ "\n"+super.toString();
    }
}


