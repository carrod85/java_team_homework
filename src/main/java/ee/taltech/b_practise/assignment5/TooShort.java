package ee.taltech.b_practise.assignment5;

import java.util.List;
import java.util.stream.Collectors;

public class TooShort {

    //todo A modify function to pass tests
    // notice here we use int length which means no nulls can be passed as length https://imgflip.com/i/3pacs6
    //todo B you decide what happens on null input, write a test and logic :)
    // don't worry about nulls inside the list (1, null, 3)
    //todo C make your solution pretty
    //todo D use streams

    /**
     * returns a list of string where length of a string is bigger than length (>)
     */
    public static List<String> filter(List<String> strings, int length){
        if( length <= 0 ){// int is a primitive so cannot be null
            return strings;
        }
        List<String> result = strings.stream().filter(n -> n.length() > length).collect(Collectors.toList());

        return result;
    }
}
