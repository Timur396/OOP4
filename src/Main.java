import Drive.A;
import Drive.Driver;
import Transport.PassengerCar;
import Transport.Transport;
import Transport.Mechanic;
import Transport.Sponsor;
import Transport.Truck;
import Transport.Bus;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        A dimon = new A("Димон", true, 2);
//        Mechanic<PassengerCar> petya = new Mechanic<PassengerCar>("Вася", "Марков", "apple");
        Mechanic<Truck> denis = new Mechanic<Truck>("Денис", "Пентегов", "завод");
//        Mechanic<Bus> pasha = new Mechanic<Bus>("Паша", "Калякин", "престиж");
//
//        Sponsor toyota = new Sponsor("Toyota", 1000);
//
//        PassengerCar passengerCar = new PassengerCar("Мазда", "3", 2.0, dimon);
//
//        passengerCar.addSponsor(toyota);
//        passengerCar.addMechanic(petya);


        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);

        Iterator<Integer> iterator= numbers.iterator();
        while (iterator.hasNext()) {
            Integer number= iterator.next();
            if (number % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}


