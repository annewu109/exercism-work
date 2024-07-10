import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class HighScores {

    List<Integer> storedScores;

    public HighScores(List<Integer> highScores) {
        storedScores = highScores;
    }

    List<Integer> scores() {
        return storedScores;
    }

    Integer latest() {
        return storedScores.get(storedScores.size() - 1);
    }

    Integer personalBest() {
        return Collections.max(storedScores);
    }

    List<Integer> personalTopThree() {
        List<Integer> output = new ArrayList<>(storedScores);
        output.sort(Collections.reverseOrder());

        return output.size() <= 2 ? output : output.subList(0, 3);
    }
}
