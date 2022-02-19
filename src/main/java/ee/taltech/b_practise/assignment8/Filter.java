package ee.taltech.b_practise.assignment8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Filter {

    //todo A write tests in FilterTest
    //todo B make tests pass
    //todo C make your solution pretty
    // it's up to you how you want to handle null inputs
    // you don't need to modify PositivesAndNegatives object
    // P.S streams don't add much value here

    /**
     * divides integer input into positives and negatives
     * zero 0, can be treated as positive
     */
    public static HashMap <String, List> filterToPositivesAndNegatives(List<Integer> numbers){
        if (numbers == null || numbers.isEmpty()){
            return null;
        }

        HashMap <String, List> positiveAndNegatives = new HashMap<String, List>();

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int i = 0; i< numbers.size(); i++){
            if (numbers.get(i)>= 0){
                positive.add(numbers.get(i));
            }
            else{
                negative.add(numbers.get(i));
            }
        }

        positiveAndNegatives.put("positive", positive);
        positiveAndNegatives.put("negative", negative);


        return positiveAndNegatives;
    }
}
