package ee.taltech.c_extra.problem3;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Birthdays {

    //todo A
    // Java 8 added an improved date & time API.
    // New classes were added like LocalDate, Period and others.
    // What does API mean in this context?
    // Answer:
    // A set of packages that model the most important aspects of something defined
    //
    //

    //todo B
    // In the main method initialize birthdays of all of your team mates (do not have to be real birthdays).
    // Call function "oldest" to find out who is the oldest. You will have to modify "oldest" to work properly.
    // Hint: when googling add java 8 to your search
    // Print out the result (oldest date).

    //todo C
    // Create a function to find out the age of person.
    // Hint: all the classes you require are mentioned on line 10
    // Print out the result (age in years).

    public static void main(String[] args) {
        ArrayList<LocalDate> birthDays = new ArrayList<>();
        birthDays.add(LocalDate.of(2001, 5, 15));
        birthDays.add(LocalDate.of(1996, 9, 18));
        birthDays.add(LocalDate.of(2000, 3, 5));
        birthDays.add(LocalDate.of(1983, 2, 23));

        System.out.println(oldest(birthDays));
        System.out.println();
        ageOfPeople(birthDays);
    }

    /**
     * returns the oldest/earliest date
     */
    public static LocalDate oldest(List<LocalDate> birthDays){
        return birthDays.stream().filter(Objects::nonNull).min(LocalDate::compareTo).orElse(null);
    }

    public static void ageOfPeople(List<LocalDate> birthDays){
        LocalDate now = LocalDate.now();
        for(LocalDate date : birthDays){
            if((date != null) && (now != null)){
                System.out.println(Period.between(date, now).getYears());
            } else{
                System.out.println("Not valid date");
            }
        }
    }
}
