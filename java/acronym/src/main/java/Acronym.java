class Acronym {

    String[] words;

    Acronym(String phrase) {
        this.words = phrase.split("-|\\s");
    }

    String get() {
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (w.isEmpty()) continue;
            int index = 0;
            while (!Character.isLetter(w.charAt(index))) {
                index++;
            }
            sb.append(Character.toUpperCase(w.charAt(index)));
        }
        return sb.toString();
    }

}
