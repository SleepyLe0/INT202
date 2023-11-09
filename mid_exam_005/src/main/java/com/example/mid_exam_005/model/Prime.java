// 65130500005 Kundids Khawmeesri
package com.example.mid_exam_005.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Prime {
    private int no;
    private int number;
    private String isPrime;

    public boolean checkPrime() {
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                isPrime = "F";
                return false;
            }
        }
        isPrime = "T";
        return true;
    }
}
