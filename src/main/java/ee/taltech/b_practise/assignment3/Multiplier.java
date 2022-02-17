package ee.taltech.b_practise.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Multiplier {

    //todo A modify function to pass tests
    //todo B modify function to pass edge case tests
    //todo C make your solution pretty
    //todo D use streams

    /**
     * multiplies each param element with multiplier
     */
    public static List<Integer> multiplier(List<Integer> params, Integer multiplier) {
        if ( params == null || (multiplier == null && params == null)){
            return List.of();
        }

        if (params.isEmpty() || multiplier == null){
            return params;
        }


        //List<Integer> multipliedList = new ArrayList<>();

        //for ( int i =0; params.size() > i ; i++){
        //    multipliedList.add(multiplier* params.get(i));
        //}
        return params.stream().map(x -> x*multiplier).collect(Collectors.toList());
    }
}
