package nl.youngcapital.demospringboot.entity;

public class Persoon {
    private String firstName;
    private String lastName;

    public Persoon(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
