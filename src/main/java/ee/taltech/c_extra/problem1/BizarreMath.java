package ee.taltech.c_extra.problem1;

public class BizarreMath {

    //todo A
    // byte is a data structure from -128 to 127
    // can you explain in plain english (simpler the better)
    // why 127 + 1 = -128 ?! (you can run main method to see it for yourself)
    // Answer:
    //
    //
    //todo B
    // How is this phenomenon called? (this is unrelated, but funny https://www.youtube.com/watch?v=h5Mc55P1i9g)
    // Answer (one word):
    //
    //todo C
    // What would you recommend developer to do?
    // Answer:
    //
    //
    //todo D
    // Does the similar thing happen with "int/Integer"?
    // Answer: Yes/No

    public static void main(String[] args) {
        byte num = 127;
        byte num2 = (byte) (num + 1);
        System.out.println(num);
        System.out.println("+ 1");
        System.out.println(num2);
    }
}
