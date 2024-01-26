//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
/**
 *Given a string s, reverse the order of characters in each word within a sentence
 while still preserving whitespace and initial word order.
 
Example 1:

    Input: s = "Let's take LeetCode contest"
    Output: "s'teL ekat edoCteeL tsetnoc"
 */
public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        
    }
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord).append(" ");
        }

        // Remove the trailing space
        result.setLength(result.length() - 1);
        return result.toString();
    }
    
}
