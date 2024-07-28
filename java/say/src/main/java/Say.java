import java.lang.StringBuilder;

public class Say {
    String[] onesDigit = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    String[] tensDigit = {"", "teen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    String[] sectionNames = {"billion", "million", "thousand", ""};

    public String say(long number) {
        StringBuilder numInEng = new StringBuilder();
        long[] sections = numberBreakup(number);

        if (sections[0] > 999 || number < 0) {
            throw new IllegalArgumentException();
        }

        if (number == 0) {
            return "zero";
        }

        for (int i = 0; i < sections.length; i++) {
            if (sections[i] == 0 && i != sections.length - 1) {
                continue;
            }
            numInEng.append(constructSection(sections[i]) + " " + sectionNames[i] + " ");
        }

        return numInEng.toString().strip();
    }

    private long[] numberBreakup(long number) {
        long[] sections = new long[4];

        long div = 1000000000;
        for (int i = 0; i < 4; i++) {
            sections[i] = number / div;
            number -= div * sections[i];
            div /= 1000;
        }

        return sections;
    }

    private String constructSection(long section) {
        if (section / 100 == 0) {
            return constructOneToNinetyNine((int) (section % 100));
        }
        else {
            return onesDigit[(int) (section / 100)] + " hundred " + constructOneToNinetyNine((int) (section % 100));
        }
    }

    private String constructOneToNinetyNine(int number) {
        String numInEng = "";
        if (number >= 0 && number <= 99) {
            if (number == 10)
                numInEng = "ten";
            else if (number == 11)
                numInEng = "eleven";
            else if (number == 12)
                numInEng = "twelve";
            else {
                if (number / 10 == 0) {
                    numInEng = onesDigit[number];
                }
                else if (number / 10 == 1) {
                    numInEng = onesDigit[number % 10] + tensDigit[1];
                }
                else if (number % 10 == 0) {
                    numInEng = tensDigit[number / 10];
                }
                else {
                    numInEng = tensDigit[number / 10] + '-' + onesDigit[number % 10];
                }
            }
        }

        return numInEng;
    }
}
