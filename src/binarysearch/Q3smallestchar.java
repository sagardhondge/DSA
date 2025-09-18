package binarysearch;

public class Q3smallestchar {

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        Q3smallestchar obj = new Q3smallestchar();

        char[] letters = {'c', 'f', 'j'};
        char[] targets = {'a', 'c', 'd', 'g', 'j'}; // test cases
        char[] results = new char[targets.length];  // array to store results

        // fill results array
        for (int i = 0; i < targets.length; i++) {
            results[i] = obj.nextGreatestLetter(letters, targets[i]);
        }

        // print results
        for (int i = 0; i < targets.length; i++) {
            System.out.println("Next greatest after '" + targets[i] + "' → " + results[i]);
        }
    }
}
