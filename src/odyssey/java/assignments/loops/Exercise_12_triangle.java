package src.odyssey.java.assignments.loops;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Exercise_12_triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter rows number: ");

        int k, rows;
        k = 1;
        rows = input.nextInt();

        for (int line = 1; line <=rows; line++) {
            for (int columns =1; columns <=line ; columns ++) {
                System.out.print(" "+k++);
            }
            System.out.println();

        }
    }
}