package data;

public class PersonalData {

    private String firstName;
    private String surname;
    private String phone;
    private String email;
    private String birthNumber;
    private String city;

    public String getFirstName() {
        return firstName;
    }

    public PersonalData setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public PersonalData setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public PersonalData setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public PersonalData setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getBirthNumber() {
        return birthNumber;
    }

    public PersonalData setBirthNumber(String birthNumber) {
        this.birthNumber = birthNumber;
        return this;
    }

    public String getCity() {
        return city;
    }

    public PersonalData setCity(String city) {
        this.city = city;
        return this;
    }
}