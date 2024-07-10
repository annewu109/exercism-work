class ResistorColorDuo {
    private enum Colors {
        black,
        brown,
        red,
        orange,
        yellow,
        green,
        blue,
        violet,
        grey,
        white
    }
    int value(String[] colors) {
       return Colors.valueOf(colors[0]).ordinal() * 10 + Colors.valueOf(colors[1]).ordinal();
    }
}
