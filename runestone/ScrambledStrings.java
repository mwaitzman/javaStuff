import java.util.List;
import java.util.ArrayList;

public class ScrambledStrings
{

   /** Modifies wordList by replacing each word with its scrambled
     *  version, removing any words that are unchanged as a result of scrambling.
     *  @param wordList the list of words
     *  Precondition: wordList contains only non-null objects
     *  Postcondition:
     *   - all words unchanged by scrambling have been removed from wordList
     *   - each of the remaining words has been replaced by its scrambled version
     *   - the relative ordering of the entries in wordList is the same as it was
     *        before the method was called
     */
     public static int randomInt(int min, int max) {
       return (int) (Math.random()*(max-min+1)+min);
     }
   public static Object[] scrambleArr(Object[] targetObjectArr) {

   }
   public static void scrambleOrRemove(List<String> wordList)
   {
     wordList.forEach(word -> {
       String oldWord = word;
       word = shuffleArr(word.toCharArray()).toString();
       if (oldWord.equals(word)) {
         wordList.remove(this)
       }
     }
     String[] words = shuffleArr(wordList);//TODO change this to letters

      /* to be implemented in part b */
      wordList.forEach( word -> {
        String originalWord = word;
        char[] charsInWord = word.toCharArray();
        for (char[] res = new char[charsInWord.length]; int i = 0; i < charsInWord.length; i++) {
          res[i] =
          charsInWord.length
        }
        word.length()
      })
   }

}
