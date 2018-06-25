/***
* 给定一个正整数a，找到最小的正整数b，它的每个数字相乘之后等于a。
* 如果没有答案，或者答案不符合32位整数，则返回0
* 样例
* 给定 a = 48, 返回 68. 给定 a = 15, 返回 35.
*/
public class Solution {
    /**
     * @param a: a positive integer
     * @return: the smallest positive integer whose multiplication of each digit equals to a
     */
    public int smallestFactorization(int a) {
        // Write your code here
        int i = 9, result = 0;
        String relist = ""; 
        while(i > 1) {
            if(a%i == 0) {
                relist += i;
                a = a/i;
            } else {
                i--;
            }
        }
        if(a != 1) return result;
        
        String tmp = new StringBuffer(relist).reverse().toString();
        
        try {
            result = Integer.parseInt(tmp);
        } catch (Exception e) {
            return 0;
        }
        
        return result;
    }
}
