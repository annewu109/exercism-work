import java.util.*;

class DnDCharacter {

    private final Random r;
    private final int[] stats;
    final int NUM_OF_DICE_ROLLS = 4;
    final int NUM_OF_STATS = 7;

    public DnDCharacter() {
        r = new Random();
        stats = new int[NUM_OF_STATS];

        for (int i = 0; i < NUM_OF_STATS - 1; i++) {
            stats[i] = ability(rollDice());
        }

        stats[6] =  10 + modifier(getConstitution());

    }

    int ability(List<Integer> scores) {
        int lowestRoll = Collections.min(scores);

        int sum = 0;
        boolean lowestRemoved = false;

        for (int roll: scores) {
            if (roll == lowestRoll && !lowestRemoved) {
                lowestRemoved = true;
            }
            else {
                sum += roll;
            }
        }

        return sum;
    }

    List<Integer> rollDice() {
        Integer[] diceRolls = new Integer[NUM_OF_DICE_ROLLS];

        for (int i = 0; i < NUM_OF_DICE_ROLLS; i++) {
            diceRolls[i] = 1 + r.nextInt(6);
        }

        return Arrays.asList(diceRolls);
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    int getStrength() {
        return stats[0];
    }

    int getDexterity() {
        return stats[1];
    }

    int getConstitution() {
        return stats[2];
    }

    int getIntelligence() {
        return stats[3];
    }

    int getWisdom() {
        return stats[4];
    }

    int getCharisma() {
        return stats[5];
    }

    int getHitpoints() {
        return stats[6];
    }
}
