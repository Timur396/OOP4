package Transport;

import java.util.Objects;

public class Mechanic<T extends Transport> {
    private final String name;
    private final String surName;
    private final String company;

    public Mechanic(String name, String surName, String company) {
        this.name = name;
        this.surName = surName;
        this.company = company;
    }

    public void doService(T transport) {
        transport.service();
    }

    public void doRepair(T transport) {
        transport.repair();
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Механик " + name + " " + surName + " из " + company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(surName, mechanic.surName) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, company);
    }
}
