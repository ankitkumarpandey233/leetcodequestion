class Solution {
    public String convertToTitle(int n) {
        StringBuilder columnTitle = new StringBuilder();

        while (n > 0) {
            int remainder = (n - 1) % 26;
            char currentChar = (char) ('A' + remainder);
            columnTitle.insert(0, currentChar);
            n = (n - 1) / 26;
        }

        return columnTitle.toString();
    }
}