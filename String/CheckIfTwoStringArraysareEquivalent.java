package KKPracticeSet.String;
//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
/**
 *Given two string arrays word1 and word2, return true if the two arrays represent 
    the same string, and false otherwise.
    A string is represented by an array if the array elements concatenated in order forms the string.

Example 1:

    Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
    Output: true
    Explanation:
    word1 represents string "ab" + "c" -> "abc"
    word2 represents string "a" + "bc" -> "abc"
    The strings are the same, so return true.
 */
public class CheckIfTwoStringArraysareEquivalent {
    public static void main(String[] args) {
        
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="";
        for(int i=0; i<word1.length; i++){
            str1=str1+word1[i];
        }
        String str2="";
        for(int j=0; j<word2.length; j++){
            str2=str2+word2[j];
        } 

        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
}
