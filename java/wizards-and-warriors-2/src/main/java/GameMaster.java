public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character c) {
        return String.format("You're a level %d %s with %d hit points.",
                c.getLevel(), c.getCharacterClass(), c.getHitPoints());
    }

    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination d) {
        return String.format("You've arrived at %s, which has %d inhabitants.",
                d.getName(), d.getInhabitants());
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod tm) {
        return switch (tm) {
            case WALKING -> "You're traveling to your destination by walking.";
            case HORSEBACK -> "You're traveling to your destination on horseback.";
        };
    }

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character c, Destination d, TravelMethod tm) {
        return String.format("%s %s %s", describe(c),  describe(tm), describe(d));
    }

    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character c, Destination d) {
        return String.format("%s %s %s", describe(c),  describe(TravelMethod.WALKING), describe(d));
    }
}
