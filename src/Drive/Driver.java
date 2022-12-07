package Drive;
import static Transport.Validate.*;
import Transport.Validate;

public abstract class Driver {
    private String name;
    private boolean license;
    private Integer experience;

    public Driver(String name, boolean license, Integer experience) {
        this.name = validationString(name);
        this.license = license;
        this.experience = validateNumber(experience);
    }

    public String getName() {
        return name;
    }

    public boolean isLicense() {
        return license;
    }

    public Integer getExperience() {
        return experience;
    }

    abstract String start();
    abstract String stop();
    abstract String refuel();


}
