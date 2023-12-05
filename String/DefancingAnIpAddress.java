
//https://leetcode.com/problems/defanging-an-ip-address/description/
/**
 *Given a valid (IPv4) IP address, return a defanged version of that IP address.
    A defanged IP address replaces every period "." with "[.]".

Example 1:
    Input: address = "1.1.1.1"
    Output: "1[.]1[.]1[.]1"
 */
public class DefancingAnIpAddress {
    public static void main(String[] args) {
        
    }
    static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
