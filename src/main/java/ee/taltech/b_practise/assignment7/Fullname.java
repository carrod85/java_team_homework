package ee.taltech.b_practise.assignment7;

public class Fullname {

    //todo A modify function to pass tests
    //todo B make your solution pretty
    //todo C use streams (extra)

    public static String fullname(String firstName, String lastName) {

        String name = firstName + " " + lastName;

        if ((firstName == null || firstName.isEmpty()) && (lastName == null || lastName.isEmpty())) {
            return "";
        }
        else if (lastName == null || lastName.isEmpty()) {
            return firstName;
        }
        else if (firstName == null || firstName.isEmpty() ) {
            return lastName;
        }
        else{
            return name;
        }

    }

}
