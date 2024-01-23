package KKPracticeSet.String;
//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/description/
/**
 *You are given a string s formed by digits and '#'. We want to map s to English lowercase 
    characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.

The test cases are generated so that a unique mapping will always exist.
Example 1:

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
 */
public class DecryptStringfromAlphabettoIntegerMapping {
    public static void main(String[] args) {
        
    }
    public String freqAlphabets(String s) {
        StringBuilder str=new StringBuilder();
        int n=s.length();
        int i=0;

        while(i<n){
            if((i+2)<n && s.charAt(i+2)== '#'){
                String substr=s.substring(i, i+2);
                int temp = Integer.parseInt(substr);
                char ch=(char)(temp+96);
                str.append(ch);
                i=i+3;
            }else{
                char ch=s.charAt(i);
                str.append((char)(ch+48));
                i++;
            }

        }
        return str.toString();
    }
}
