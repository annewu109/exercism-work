import java.util.ArrayList;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        ArrayList<Integer> digits = new ArrayList<>();
        int toMatch = 0;

        for (int i = numberToCheck; i > 0; i /= 10) {
            digits.add(i % 10);
        }

        for (int d : digits) {
            toMatch += Math.pow(d, digits.size());
        }

        return toMatch == numberToCheck;
    }

}
