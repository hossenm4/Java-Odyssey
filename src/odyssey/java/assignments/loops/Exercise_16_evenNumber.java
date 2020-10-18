package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class Exercise_16_evenNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("To get even numbers, Please enter the last number of set: ");

        int i, endNumbers, sum;
        i = 2;
        endNumbers = scanner.nextInt();
        sum = 0;

        //for (int i = 2; i <= endNumbers; i = i + 2) {

            while(i <= endNumbers){
            System.out.println(i);
            sum = sum + i;
            i=i+2;
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}