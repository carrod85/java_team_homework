package ee.taltech.b_practise.assignment4;

import java.util.List;
import java.util.stream.Collectors;

public class PowerOf3 {

    //todo A modify function to pass tests
    //todo B you decide what happens on null input, write a test and logic :)
    // don't worry about nulls inside the list (1, null, 3)
    //todo C make your solution pretty
    //todo D use streams

    /**
     * multiplies each number to the power of three
     */
    public static List<Integer> toThePowerOfThree(List<Integer> params) {
        if (params == null || params.isEmpty()){
            return params;
        }

        return params.stream().map(x -> x*x*x).collect(Collectors.toList());
    }
}
