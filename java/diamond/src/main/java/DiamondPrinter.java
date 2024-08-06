import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.util.Collections;

class DiamondPrinter {

    List<String> printToList(char a) {
        int charNum = (a - 'A');
        int rowLen = charNum * 2 + 1;

        List<String> diamond = new ArrayList<>();

        for (char currLetter = 'A'; currLetter <= a; currLetter++) {
            StringBuilder currRow = new StringBuilder();
            if (currLetter == 'A') {
                for (int i = 0; i < rowLen; i++) {
                    if (i == rowLen / 2 || rowLen == 1) {
                        currRow.append('A');
                    } else {
                        currRow.append(' ');
                    }
                }
                diamond.add(currRow.toString());
            }
            else {
                for (int i = 0; i < charNum; i++) {
                    if (i == charNum - (currLetter - 'A')) {
                        currRow.append(currLetter);
                    }
                    else {
                        currRow.append(' ');
                    }
                }
                StringBuilder flipped = currRow.reverse();
                diamond.add(currRow + " " + flipped);
            }
        }
        List<String> flippedList = diamond.subList(0, diamond.size() - 1);
        Collections.reverse(flippedList);
        diamond.addAll(flippedList);
        return diamond;
    }

}
