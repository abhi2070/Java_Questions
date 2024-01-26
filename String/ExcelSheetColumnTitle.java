//https://leetcode.com/problems/excel-sheet-column-title/description/
/**
 *Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
 */
public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        
    }
     public String convertToTitle(int col) {
        StringBuilder str=new StringBuilder();

        while(col>0){
            int r=(col-1)%26;
            str.append((char)(r+'A'));
            col=(col-1)/26;
        }
        return str.reverse().toString();
    }
}
