package com.twu.exercises;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsExercise {
    public static void main(String args[]){
        int inputNum = 1;
        List<Integer> resultList = generate(inputNum);
    }

    private static List<Integer> generate(int inputNum) {
        List<Integer> resultList = new ArrayList();
        for (int i = 2; i <= inputNum; i++) {
            if(inputNum % i ==0){
                int index = 0;
                for (int j = 1; j <=i; j++) {
                    if(i%j==0){
                        index++;
                    }
                    if (index>2){
                        break;
                    }
                }
                if (index>2){
                    continue;
                }else {
                    resultList.add(i);
                }
            }
        }

        for (int i : resultList) {
            System.out.println(i);
        }
        return resultList;
    }
}
