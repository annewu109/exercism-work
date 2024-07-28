import java.util.HashMap;

class Scrabble {
    HashMap<Character, Integer> LetterToVal = new HashMap<>();
    char[] word;

    Scrabble(String word) {
        this.word = word.toUpperCase().toCharArray();
        multiPut(1, 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T');
        multiPut(2, 'D', 'G');
        multiPut(3, 'B', 'C', 'M', 'P');
        multiPut(4, 'F', 'H', 'V', 'W', 'Y');
        multiPut(5, 'K');
        multiPut(8, 'J', 'X');
        multiPut(10, 'Q', 'Z');
    }

    private void multiPut(int value, char... keys) {
        for (char key : keys) {
            LetterToVal.put(key, value);
        }
    }

    int getScore() {
        int sum = 0;
        for (char letter : word) {
            sum += LetterToVal.get(letter);
        }

        return sum;
    }

}
