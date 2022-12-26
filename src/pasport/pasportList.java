package pasport;

import java.util.Set;

public class pasportList {
    private Set<Pasport> pasports;

    public pasportList(Set<Pasport> pasports) {
        this.pasports = pasports;
    }

    public void add(Pasport pasport) {
       Pasport old =get(pasport.getNumber());
        if (old != null) {
            pasports.remove(old);
            pasports.add(pasport);
        }
    }

    public Pasport get(String number) {
        for (Pasport pasport : pasports) {
           if (pasport.getNumber().equals(number)) {
                return pasport;
            }
        } return null;
    }

    @Override
    public String toString() {
        return pasports.toString();
    }
}
