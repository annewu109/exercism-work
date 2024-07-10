import java.util.HashMap;

class RnaTranscription {
    private final HashMap<Character, Character> DNAtoRNA = new HashMap<>();

    public RnaTranscription() {
        DNAtoRNA.put('G', 'C');
        DNAtoRNA.put('C', 'G');
        DNAtoRNA.put('T', 'A');
        DNAtoRNA.put('A', 'U');
    }
    String transcribe(String dnaStrand) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < dnaStrand.length(); i++) {
            sb.append(DNAtoRNA.get(dnaStrand.charAt(i)));
        }

        return sb.toString();
    }

}
