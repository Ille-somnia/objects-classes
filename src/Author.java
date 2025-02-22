import java.util.Objects;

public class Author {
   private final String firstName;
   private final String lastName;

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public Author(String firstName, String lastName) {
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


