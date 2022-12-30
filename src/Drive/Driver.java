package Drive;
import static Transport.Validate.*;

import Transport.Transport;
import Transport.Validate;

import java.util.*;

public abstract class Driver <T extends Transport>{
    private final String name;
    private final boolean license;
    private final Integer experience;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return license == driver.license && Objects.equals(name, driver.name) && Objects.equals(experience, driver.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, license, experience);
    }

    @Override
    public String toString() {
        return name;
    }
}
