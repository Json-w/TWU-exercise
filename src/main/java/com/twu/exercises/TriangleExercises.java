package com.twu.exercises;

import java.util.Scanner;

public class TriangleExercises {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            drawLine(number, i);
            System.out.println();
        }

        for (int i = number-2; i >= 0 ; i--) {
            drawLine(number, i);
            System.out.println();
        }
    }

    private static void drawLine(int number, int i) {
        for (int j = 0; j < number*2-1; j++) {
            if(j<=(number+i)-1 && j>=(number-i)-1){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
        }
    }
}
