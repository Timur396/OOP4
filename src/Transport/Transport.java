package Transport;
import Drive.Driver;

import java.util.*;

public  abstract  class Transport {
    private String make;
    private String model;
    private double engineCapacity;
    private final Set<Sponsor> sponsors;
    private final Set<Mechanic<?>> mechanics;
    public Transport(String make,
                     String model,
                     double engineCapacity) {
        this.make = Validate.validationString(make);
        this.model = Validate.validationString(model);
        this.engineCapacity = engineCapacity;
        this.sponsors = new HashSet<>();
        this.mechanics = new HashSet<>();
    }
    public  void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }
    public  void addMechanic(Mechanic<?> mechanic) {
       mechanics.add(mechanic);
    }
    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }
    public Set<Sponsor> getSponsors() {
        return sponsors;
    }
    abstract void startMove();
    abstract void stopMove();
    public abstract boolean service();
    public abstract void repair();
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = Validate.validationString(make);
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = Validate.validationString(model);
    }
    public double getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        List<Sponsor> sponsorList = new ArrayList<>(sponsors);
        if (!sponsorList.isEmpty()) {
            result.append("Спонсоры: ");
        }
        for (int i = 0; i < sponsorList.size(); i++) {
            result.append(sponsorList.get(i));
            if (i != sponsorList.size() - 1) {
                result.append(", ");
            }
        }
        result.append("\n");
        List<Mechanic> mechanicList = new ArrayList<>(mechanics);
        if (!mechanicList.isEmpty()) {
            result.append("Механики: ");
        }
        for (int i = 0; i < mechanicList.size(); i++) {
            result.append(mechanicList.get(i));
            if (i != mechanicList.size() - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }
}





