import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return Set.copyOf(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !myCollection.containsAll(theirCollection) && !theirCollection.containsAll(myCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> output = new HashSet<>();
        for (int i = 0; i < collections.size(); i++) {
            if (i == 0) {
                output.addAll(collections.get(0));
            }
            output.retainAll(collections.get(i));
        }
        return output;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> output = new HashSet<>();
        for (int i = 0; i < collections.size(); i++) {
            output.addAll(collections.get(i));
        }
        return output;
    }
}
