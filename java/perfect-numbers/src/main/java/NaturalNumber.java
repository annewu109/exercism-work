class NaturalNumber {
    Classification classification;
    NaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }

        int sumOfFactors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sumOfFactors += i;
        }

        if (sumOfFactors < number) classification = Classification.DEFICIENT;
        else if (sumOfFactors == number) classification = Classification.PERFECT;
        else classification = Classification.ABUNDANT;
    }

    Classification getClassification() {
        return classification;
    }
}
