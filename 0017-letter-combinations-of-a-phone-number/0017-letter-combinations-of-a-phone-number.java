import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    private final HashMap<Character, char[]> keyboard;
    private final ArrayList<String> allCombinations;
    private String digits;

    public Solution() {
        this.allCombinations = new ArrayList<>();
        this.keyboard = new HashMap<>(8) {
            {
                put('2', new char[]{'a', 'b', 'c'});
                put('3', new char[]{'d', 'e', 'f'});
                put('4', new char[]{'g', 'h', 'i'});
                put('5', new char[]{'j', 'k', 'l'});
                put('6', new char[]{'m', 'n', 'o'});
                put('7', new char[]{'p', 'q', 'r', 's'});
                put('8', new char[]{'t', 'u', 'v'});
                put('9', new char[]{'w', 'x', 'y', 'z'});
            }
        };
    }

    public List<String> letterCombinations(String digits) {
        this.digits = digits;
        if (!digits.isEmpty()) this.findAllCombinations(0, new StringBuilder());
        return this.allCombinations;
    }

    private void findAllCombinations(int currentIndex, StringBuilder currentCombination) {
        if (currentIndex >= this.digits.length()) this.allCombinations.add(currentCombination.toString());
        else {
            char digit = this.digits.charAt(currentIndex);
            for (char letter : this.keyboard.get(digit)) {
                currentCombination.append(letter);
                this.findAllCombinations(currentIndex + 1, currentCombination);
                currentCombination.deleteCharAt(currentCombination.length() - 1);
            }
        }
    }
}