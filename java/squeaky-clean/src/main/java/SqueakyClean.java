import java.lang.StringBuilder;

class SqueakyClean {
    static String clean(String identifier) {
        int len = identifier.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {

            switch (identifier.charAt(i)) {
                case ' ':
                    sb.append('_');
                    break;
                case '4':
                    sb.append('a');
                    break;
                case '3':
                    sb.append('e');
                    break;
                case '0':
                    sb.append('o');
                    break;
                case '1':
                    sb.append('l');
                    break;
                case '7':
                    sb.append('t');
                    break;
                case '-':
                    sb.append(Character.toUpperCase(identifier.charAt(++i)));
                    break;
                default:
                    if (Character.isLetter(identifier.charAt(i))
                            || identifier.charAt(i) == '_') {
                        sb.append(identifier.charAt(i));
                    }
            }
        }
        return sb.toString();
    }
}