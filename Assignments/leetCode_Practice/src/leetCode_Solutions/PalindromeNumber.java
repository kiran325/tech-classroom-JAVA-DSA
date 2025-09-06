package leetCode_Solutions;

public class PalindromeNumber {
	
	public boolean isPalindrome(int x) {
        // Special cases
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            int digit = x % 10;
            reversedHalf = reversedHalf * 10 + digit;
            x /= 10;
        }

        // If even length -> x == reversedHalf
        // If odd length -> ignore middle digit (reversedHalf/10)
        return (x == reversedHalf || x == reversedHalf / 10);
    }
}
	
	
	


