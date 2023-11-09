// 65130500005 Kundids Khawmeesri
package com.example.mid_exam_005.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PrimeHistory {
    private User user;
    private List<Prime> primeList = new ArrayList<>();
    private int noOfPrime = 0;

    public void addHistory(Prime prime) {
        primeList.add(prime);
        if (prime.checkPrime()) {
            noOfPrime++;
        }
    }
}
