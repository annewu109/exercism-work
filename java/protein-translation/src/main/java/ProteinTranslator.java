import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

class ProteinTranslator {
    HashMap<String, String> RNAToProtein;

    public ProteinTranslator() {
        RNAToProtein = new HashMap<>();
        RNAToProtein.put("AUG", "Methionine");
        RNAToProtein.put("UUU", "Phenylalanine");
        RNAToProtein.put("UUC", "Phenylalanine");
        RNAToProtein.put("UUA", "Leucine");
        RNAToProtein.put("UUG", "Leucine");
        RNAToProtein.put("UCU", "Serine");
        RNAToProtein.put("UCC", "Serine");
        RNAToProtein.put("UCA", "Serine");
        RNAToProtein.put("UCG", "Serine");
        RNAToProtein.put("UAU", "Tyrosine");
        RNAToProtein.put("UAC", "Tyrosine");
        RNAToProtein.put("UGU", "Cysteine");
        RNAToProtein.put("UGC", "Cysteine");
        RNAToProtein.put("UGG", "Tryptophan");
        RNAToProtein.put("UAA", "STOP");
        RNAToProtein.put("UAG", "STOP");
        RNAToProtein.put("UGA", "STOP");
    }

    List<String> translate(String rnaSequence) {

        ArrayList<String> proteinSequence = new ArrayList<>();
        IllegalArgumentException exception = new IllegalArgumentException("Invalid codon");

        int i = 3;
        for (; i <= rnaSequence.length(); i += 3) {
            String currProtein = RNAToProtein.get(rnaSequence.substring(i - 3, i));
            if (currProtein == null)
                throw exception;
            else if (currProtein.equals("STOP")) {
                proteinSequence.add(currProtein);
                break;
            }
            else
                proteinSequence.add(currProtein);
        }

        try {
            if (rnaSequence.isEmpty()) ;
            else if (proteinSequence.get(proteinSequence.size() - 1).equals("STOP")) {
                proteinSequence.remove(proteinSequence.size() - 1);
            } else if (rnaSequence.length() % 3 != 0 || rnaSequence.length() > i) {
                throw exception;
            }
        }
        catch (IndexOutOfBoundsException e) {
            throw exception;
        }

        return proteinSequence;
    }
}
