package org.example.halvingsum;

public class HalvingSum {

    int halvingSum(int n) {

        int result = 0;

        while (n >= 1) {
            result += n;
            n = (n / 2);
        }
        return result;
    }

}
