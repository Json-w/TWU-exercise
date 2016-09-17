package com.twu.exercises;

import java.util.Scanner;

public class TriangleExercises {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number*2-1; j++) {
                if(j<=(number+i)-1 && j>=(number-i)-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
