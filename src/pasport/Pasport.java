package pasport;

import java.time.LocalDate;
import java.util.Objects;

public class Pasport {
    private String number;
    private String name;
    private String surName;
    private String patronymicName;
    private LocalDate birtDay;


    public Pasport(String number, String name, String surName, String patronymicName, LocalDate birtDay) {
        this.number = number;
        this.name = name;
        this.surName = surName;
        this.patronymicName = patronymicName;
        this.birtDay = birtDay;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public LocalDate getBirtDay() {
        return birtDay;
    }

    public void setBirtDay(LocalDate birtDay) {
        this.birtDay = birtDay;
    }

    @Override
    public String toString() {
        return number+" "+number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasport pasport = (Pasport) o;
        return Objects.equals(number, pasport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
