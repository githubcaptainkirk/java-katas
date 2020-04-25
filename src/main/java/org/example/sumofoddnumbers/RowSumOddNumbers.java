package org.example.sumofoddnumbers;

import java.util.ArrayList;

public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int number = 0;
        int value = 0;
        int result = 0;
        ArrayList<Integer> listArray = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                number++;
                if (number % 2 == 1) {
                    listArray.add(number);
                    for (int val : listArray) {
                        value += val;
                    }
                    result = value;
                    number++;
                }
                listArray.clear();
            }
            value = 0;
        }
        return result;
    }
}
