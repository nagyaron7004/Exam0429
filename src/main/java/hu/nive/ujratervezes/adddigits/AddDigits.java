package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        int result = 0;
        if ( input == null || input.equals("") || input.length() == 0 || input.isEmpty()) {
            return -1;
        }

        for (int i = 0; i < input.length(); i++) {
            try {
                result += Integer.parseInt(String.valueOf(input.charAt(i)));
            } catch (NumberFormatException e) {
                continue;
            }
        }
    return result;
    }
}
