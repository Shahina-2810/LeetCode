class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;

        while (index < words.length) {
            int lineStart = index;
            int lineLength = words[index].length();
            index++;

            while (index < words.length && lineLength + words[index].length() + (index - lineStart) <= maxWidth) {
                lineLength += words[index].length();
                index++;
            }

            int totalSpaces = maxWidth - lineLength;
            int numWords = index - lineStart;

            StringBuilder line = new StringBuilder(words[lineStart]);
            
            if (numWords == 1 || index == words.length) { // Left-justify last line or single-word lines
                for (int i = lineStart + 1; i < index; i++) {
                    line.append(' ').append(words[i]);
                }
                line.append(String.valueOf(' ').repeat(maxWidth - line.length())); // Add extra spaces at the end
            } else {
                int spacesBetweenWords = totalSpaces / (numWords - 1);
                int extraSpaces = totalSpaces % (numWords - 1);
                
                for (int i = lineStart + 1; i < index; i++) {
                    int spaces = spacesBetweenWords + (extraSpaces-- > 0 ? 1 : 0);
                    line.append(String.valueOf(' ').repeat(spaces)).append(words[i]);
                }
            }

            result.add(line.toString());
        }

        return result;
    }
}