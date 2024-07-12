import java.util.stream.IntStream;

public class Hamming {
    int hammingDistance;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }

        hammingDistance = IntStream.range(0, leftStrand.length())
                .reduce(0, (hamcount, index)
                        -> hamcount + (leftStrand.charAt(index) != rightStrand.charAt(index) ? 1 : 0));
    }

    public int getHammingDistance() {
        return hammingDistance;
    }
}
