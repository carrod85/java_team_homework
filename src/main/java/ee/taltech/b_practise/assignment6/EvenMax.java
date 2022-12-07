package ee.taltech.b_practise.assignment6;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class EvenMax {

    //todo A modify function to pass tests
    //todo B make your solution pretty
    //todo C use streams

    /**
     * returns maximum even number from the list
     * even numbers are numbers evenly divisible by 2
     * for example 2, -6, 128, 2n
     */
    public static Integer maximum(List<Integer> params) {
        if (params == null || params.isEmpty() || params.stream().filter(n->n % 2 == 0).collect(Collectors.toList()).isEmpty()){
            return null;
        }

        Integer max = params.stream().filter(n->n % 2 == 0).mapToInt(m->m).max().orElse(0);

        return max;
    }

    //todo D programmer has designed to return null on null/empty input
    // You can observe it on tests as: _null_is_maximum_of_no_numbers, _null_is_maximum_of_odd_numbers
    // Can you think of 2 different ways developer could have solved null/empty inputs?
    // 1 One option can create another auxiliar function/method to filter input.
    // 2 Other option to do it in the method where is needed (in this case there is only one)
    //todo E
    // Which option would you prefer and why?
    // Answer: If you have to repeat it the same several times you should create and auxiliar method/function to filter.
}
