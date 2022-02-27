package programs;

import java.util.List;

public class Calculation {

    public Long add(Long number1, Long number2) {
        return number1 + number2;
    }

    public Long multiply(Long number1, Long number2) {
        return number1 * number2;
    }

    public Long subtract(Long number1, Long number2) {
        return number1 - number2;
    }

    public Long divide(Long number1, Long number2) {
        if (number2 == 0) {
            return null;
        }

        return number1 / number2;
    }

    public Long findMaximumNumber(List<Long> numbers) {
        Long max = 0L;

        for (Integer i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }

        return max;
    }
}
