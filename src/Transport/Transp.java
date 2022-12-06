package Transport;

public abstract class Transp {
    private String make;
private String model;
private double engineCapacity;

    public Transp(String make, String model, double engineCapacity) {
        this.make = Validate.validateString(make);
        this.model = Validate.validateString(model);
        this.engineCapacity = engineCapacity;
    }

     abstract void startMovemoment() ;

     abstract void stopMovemoment();



    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = Validate.validateString(make);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = Validate.validateString(model);
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
