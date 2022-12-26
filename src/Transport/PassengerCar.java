
package Transport;

import Drive.A;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PassengerCar extends Transport implements Competing{
    private  Drive.A driver;
    private  Integer pitStopTime;
    private  Integer maxSpeed;
    private  Integer bestLapTime;
    private final Set<Mechanic<PassengerCar>> mechanics;
    public PassengerCar(String make,
                        String model,
                        double engineCapacity,
                        Integer pitStopTime,
                        Integer maxSpeed,
                        Integer bestLapTime, Mechanic<PassengerCar>... mechanics) {
        super(make, model, engineCapacity);
        this.mechanics = new HashSet<>(Arrays.asList(mechanics));
        setDriver(driver);
        this.bestLapTime = Validate.validateNumber(bestLapTime);
        this.pitStopTime = Validate.validateNumber(pitStopTime);
        this.maxSpeed = Validate.validateNumber(maxSpeed);
    }

    public void setDriver(A driver) {
        this.driver = driver;
    }
    @Override
    void startMove() {
        System.out.println( "Легковой автомобиль начал движение");

    }
    @Override
    void stopMove() {
        System.out.println("Легковой автомобиль закончил движение");
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
    public boolean service() {
        return Math.random()>0.7;
    }

    @Override
    public void repair() {
        System.out.println("Машина "+ getMake() +" "+ getModel() +" починена ");
    }
    @Override
    public String toString() {
        return "Автомобиль с водителем"+ driver+ "\n"+super.toString();
    }
}


