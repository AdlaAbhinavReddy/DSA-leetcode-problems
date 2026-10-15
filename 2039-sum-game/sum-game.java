class Solution {
    public boolean sumGame(String num) {
        int fhqMark = 0, shqMark = 0;
        int fhValue = 0, shValue = 0;
        int start = 0, end = num.length(), mid = start + (end - start) / 2;
        while (start < mid) {
            if (num.charAt(start) == '?') {
                fhqMark++;
            } else {
                int val = num.charAt(start) - '0';
                fhValue += val;
            }
            start++;
        }
        while (mid < end) {
            if (num.charAt(mid) == '?') {
                shqMark++;
            } else {
                int val = num.charAt(mid) - '0';
                shValue += val;
            }
            mid++;
        }
        if (fhValue == shValue && (shqMark == 0 && fhqMark == 0) && (fhqMark == shqMark)) {
            return false;
        }
        return (fhqMark + shqMark) % 2 == 1
                || fhValue - shValue != 9 * (shqMark - fhqMark) / 2;
    }
}