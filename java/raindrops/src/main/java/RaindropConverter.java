class RaindropConverter {

    String convert(int number) {
        String sounds = "";
        if (number % 3 == 0)
            sounds = sounds + "Pling";
        if (number % 5 == 0)
            sounds = sounds + "Plang";
        if (number % 7 == 0)
            sounds = sounds + "Plong";

        if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
            sounds = Integer.toString(number);
        }

        return sounds;
    }

}
