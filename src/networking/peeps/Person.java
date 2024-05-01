package networking.peeps;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private int ID;
    private String Firstname;
    private String lastname;

    public Person(int ID, String firstname, String lastname) {
        this.ID = ID;
        Firstname = firstname;
        this.lastname = lastname;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getID() {
        return ID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", Firstname='" + Firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getID() == person.getID() && Objects.equals(getFirstname(), person.getFirstname()) && Objects.equals(getLastname(), person.getLastname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID(), getFirstname(), getLastname());
    }
}
