package ee.taltech.b_practise.assignment8;

import ee.taltech.b_practise.assignment4.PowerOf3;
import ee.taltech.b_practise.assignment7.Fullname;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilterTest {


    //todo write the tests you think are necessary :)
    @Test
    void check_positive() {
        assertEquals(List.of(0,1,2), Filter.filterToPositivesAndNegatives(List.of(0,1,-1,2,-4)).get("positive"));
    }
    @Test
    void check_negative() {
        assertEquals(List.of(-1,-4), Filter.filterToPositivesAndNegatives(List.of(0,1,-1,2,-4)).get("negative"));
    }
    @Test
    void check_null() {
        assertEquals(null, Filter.filterToPositivesAndNegatives(null));
    }

    @Test
    void check_empty() {
        assertEquals(null, Filter.filterToPositivesAndNegatives(List.of()));
    }
}
