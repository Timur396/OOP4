package Transport;

import java.util.Objects;

public class Sponsor {
    private final String name;
    private int ammountOfSupport;

    public Sponsor(String name, int ammountOfSupport) {
        this.name = name;
        this.ammountOfSupport = ammountOfSupport;
    }

    public String getName() {
        return name;
    }

    public int getAmmountOfSupport() {
        return ammountOfSupport;
    }

    public void sponsorRace() {
        ammountOfSupport = 0;
    }

    @Override
    public String toString() {
        return " Спонсор " + name + " , сумма поддержки: " + ammountOfSupport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return ammountOfSupport == sponsor.ammountOfSupport && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ammountOfSupport);
    }
}
