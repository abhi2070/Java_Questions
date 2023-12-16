//program to write alphabets
/**
 * This is also a case where we should not use string as a data type because of space and it is also 
 * have time complexity O(N2) 
 * here we can use StringBuilder.
 * @author ASUS
 */
public class ABCD {
    public static void main(String[] args) {
        String str="";
        for (int i=0; i<26; i++) {
            char ch=(char)('a'+i);
            str=str+ch;
        }
        System.out.println(str);
        
        // we can do same with string Builder
        
        StringBuilder builder=new StringBuilder();
        for (int i=0; i<26; i++) {
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
