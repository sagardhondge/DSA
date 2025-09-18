package Arrays;

public class Panagram {
        public static boolean isPangram(String sentence) {
            sentence = sentence.toLowerCase();  // ignore case
            boolean[] seen = new boolean[26];   // track letters a-z

            for (char ch : sentence.toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                    seen[ch - 'a'] = true;      // mark this letter as seen
                }
            }

            // check if all 26 letters are seen
            for (boolean present : seen) {
                if (!present) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            String s1 = "The quick brown fox jumps over the lazy dog";
            String s2 = "Hello World";

            System.out.println("Sentence 1: " + isPangram(s1)); // true
            System.out.println("Sentence 2: " + isPangram(s2)); // false
        }
    }

