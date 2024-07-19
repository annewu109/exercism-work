import java.util.Arrays;
import java.util.HashSet;

public class PangramChecker {

    public boolean isPangram(String input) {
        return new HashSet<>(Arrays.asList(input.toLowerCase().split("")))
                .containsAll(Arrays.asList("qwertyuiopasdfghjklzxcvbnm".split("")));
    }

}
