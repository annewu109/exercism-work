class CollatzCalculator {

    int computeStepCount(int start) {
        int steps = 0;

        if (start <= 0) {
            throw new IllegalArgumentException("Only positive integers are allowed");
        }

        while (start != 1) {
            if (start % 2 == 0) {
                start /= 2;
            }
            else {
                start = 3 * start + 1;
            }

            steps++;
        }

        return steps;
    }

}
