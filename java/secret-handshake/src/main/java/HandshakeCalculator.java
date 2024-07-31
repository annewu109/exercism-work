import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> vals = Arrays.asList(Signal.values()); Collections.reverse(vals);
        List<Signal> handshake = new ArrayList<>();

        String binaryRep = String.format("%5s", Integer.toBinaryString(number)).replace(" ","0");
        binaryRep = binaryRep.length() > 5 ? binaryRep.substring(binaryRep.length() - 5) : binaryRep;

        for (int i = 4; i >= 1; i--) {
            if (binaryRep.charAt(i) == '1') {
                handshake.add(vals.get(i - 1));
            }
        }

        if (binaryRep.charAt(0) == '1') {
            Collections.reverse(handshake);
        }

        return handshake;
    }
}
