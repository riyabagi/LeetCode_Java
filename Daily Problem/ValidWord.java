class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char ch : word.toCharArray()) {
            if (isVowel(ch)) {
                hasVowel = true;
            } else if (isLetter(ch)) {
                hasConsonant = true;
            } else if (isDigit(ch)) {

            } else {
                return false;
            }
        }
        return hasVowel && hasConsonant;
    }

    public boolean isVowel(char chr) {
        char ch = Character.toLowerCase(chr);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public boolean isLetter(char chr) {
        return Character.isLetter(chr);
    }

    public boolean isDigit(char chr) {
        return Character.isDigit(chr);
    }
}