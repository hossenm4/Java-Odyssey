package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class Exercise_8_OddNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number: ");

        int sum, numbers;
        sum =0;
        numbers = scanner.nextInt();
        System.out.println("Odd numbers are: ");

        for(int num1 =1; num1 <= 20; num1++) {
            if( num1 % 2 !=0){
                System.out.println(num1);
                sum = sum+num1;
            }

        }
        System.out.println("Total sum of odd numbers: "+sum);
    }
}
