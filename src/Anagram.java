import java.util.Arrays;

public class Anagram {

    private String  word;   // Original word

    private String  key;    // Key for original word. Example: key for "star" and "rats" is "arst".

    public Anagram(String word) {
        this.word   = word.toLowerCase();
        this.key    = makeAnagramKey();
    }


    /**
     * Helper method to make an anagram key of original word.
     * @return  - returns anagram key.
     */
    private String makeAnagramKey() {
        char[] chars    = this.word.toCharArray();      // convert original word to char array
        Arrays.sort(chars);                             // sort characters

        return  new String(chars);                       // return string of sorted characters
    }


    // GETTERS
    public String getWord() {
        return word;
    }

    public String getKey() {
        return key;
    }

}
