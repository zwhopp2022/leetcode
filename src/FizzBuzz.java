// 412. Fizz Buzz
// Completed by Zachary Hopp 8/29/2023

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> fizzrray = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                fizzrray.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzrray.add("Fizz");
            } else if (i % 5 == 0) {
                fizzrray.add("Buzz");
            } else {
                fizzrray.add(String.valueOf(i));
            }
        }
        return fizzrray;
    }

}

class fizzBuzzMain {
    public static void main(String[] args) {
        int enter = 5;
        List<String> expected = new ArrayList<String>(Arrays.asList("1", "2", "Fizz", "4", "Buzz"));

        List<String> actual = FizzBuzz.fizzBuzz(enter);

        for (String entry : actual) {
            System.out.print(entry + " ");
        }
    }
}
