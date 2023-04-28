import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger aA = new BigInteger(a,2);
        BigInteger bB = new BigInteger(b,2);
        return aA.add(bB).toString(2);
    }
}