class ResistorColorTrio {
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
    String label(String[] colors) {
        int baseRes = Colors.valueOf(colors[0]).ordinal() * 10 + Colors.valueOf(colors[1]).ordinal();
        int numOfPowers = Colors.valueOf(colors[2]).ordinal();

        if (Colors.valueOf(colors[1]).ordinal() == 0 && Colors.valueOf(colors[0]).ordinal() != 0) {
            baseRes /= 10;
            numOfPowers++;
        }

        if (numOfPowers >= 9) {
                return baseRes + "0".repeat(numOfPowers - 9) + " gigaohms";
        }
        else if (numOfPowers >= 6) {
            return baseRes + "0".repeat(numOfPowers - 6) + " megaohms";
        }
        else if (numOfPowers >= 3) {
            return baseRes + "0".repeat(numOfPowers - 3) + " kiloohms";
        }
        else {
            return baseRes + "0".repeat(numOfPowers) + " ohms";
        }

    }
}
