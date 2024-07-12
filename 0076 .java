package Kyu8.thisisaproblem;

public class NameMe {

    public String firstName;
    public String lastName;
    public String fullName;

    public NameMe(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        this.fullName = first + " " + last;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public static void main(String[] args) {
        NameMe nameMe = new NameMe("Muhammad", "Zuhdi");
        nameMe.getFirstName();
        nameMe.getLastName();
        nameMe.getFullName();
    }
}
