

public class SearchCharInString {
    public static void main(String[] args) {
        String name="Abhijeet";
        char ch='k';
        System.out.println(linearSearch(name,ch));
    }
    static boolean linearSearch(String str, char target){
        if (str.length()== 0) {
            return false; 
        }
        for (int i=0; i<str.length(); i++) {
            char ch= str.charAt(i);
            if (ch==target) {
                return true;
            }
        }
        return false;
    }
}
