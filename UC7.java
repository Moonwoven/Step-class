import java.util.HashMap;
import java.util.Map;

public class UC7 {

    public static void main(String[] args) {

        CharacterPatternMap patternMap = new CharacterPatternMap();

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(patternMap.getPattern(ch)[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    // Static Inner Class to manage character patterns
    static class CharacterPatternMap {

        private final Map<Character, String[]> patternMap = new HashMap<>();

        public CharacterPatternMap() {

            patternMap.put('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            });

            patternMap.put('P', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    " ***** ",
                    "*      ",
                    "*      ",
                    "*      "
            });

            patternMap.put('S', new String[]{
                    " ***** ",
                    "*      ",
                    "*      ",
                    " ***** ",
                    "      *",
                    "      *",
                    " ***** "
            });
        }

        public String[] getPattern(char ch) {
            return patternMap.getOrDefault(ch, new String[7]);
        }
    }
}