class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if(digits[i] != 9) {
                digits[i] += 1;
                break;
            }
            else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] result = new int[digits.length+1];
            result[0] = 1;
            return result;
        }
        return digits;
    }
}