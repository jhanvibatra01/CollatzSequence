package com.tw;

import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int NoOfOperations = 0;

        while(number != 1) {

            System.out.print(number + " ");
            if(number % 2 == 0) {
                number = number / 2;
            }
            else {
                number = 3 * number + 1;
            }
            NoOfOperations++;
        }

        System.out.print(number + " " + NoOfOperations);
    }
}
