import java.util.ArrayList;

public class WordScramble
{
    public static String scrambleWord(String word){
        String scrambled = "";
        for (int i = 0; i < word.length() - 1; i++) {
            scrambled += word.substring(i, i + 1);
            if (word.charAt(i).equals("A") || word.charAt(i + 1).equals("A")) {
                if (!(word.substring(i + 2, i + 3).equals("A"))) {
                    scrambled += word.charAt(i + 1) + word.charAt(i);
                    i ++;
                } else {
                    scrambled += word.charAt(i) + word.charAt(i + 1);
                }
            }
        }
        return scrambled;
    }


    /** Modifies wordList by replacing each word with its scrambled
     *  version, removing any words that are unchanged as a result of scrambling.
     *
     *  @param wordList the list of words
     *
     *  Precondition: wordList contains only non-null objects
     *  Postcondition:
     *  - all words unchanged by scrambling have been removed from wordList
     *  - each of the remaining words has been replaced by its scrambled version
     *  - the relative ordering of the entries in wordList is the same as it was
     *    before the method was called
     */
    public static void scrambleOrRemove(ArrayList<String> wordList)
    {
        /* to be implemented in part (b) */
    }
}