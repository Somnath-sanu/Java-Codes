package Arrays;
import java.util.*;
public class arrayTostring {
    public static void main(String[] args) {
        int[]a = {1,2,3,4};
        String s = Arrays.toString(a);
        System.out.println(s);
        System.out.println(s instanceof String); // true
    }
}
