package numbers;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumbers {

    public boolean isPerfectNumber (int number) {
        List<Integer> divisor = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisor.add(i);
            }
        }

        for (int  s: divisor) {
            sum += s;
        }

        return sum == number? true : false;
    }
}
