package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class Exercise_4_Sum_Ofnumber_and_average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double average = 0;
         int sum_ofNumber = 0,inputNumber;
        //inputNumber = sc.nextInt();
        System.out.println("Please enter your number: ");
        inputNumber = sc.nextInt();

         for(int num1 = 1; num1<=inputNumber ; num1++){

            sum_ofNumber = ( sum_ofNumber + num1);

            average = (double)sum_ofNumber/10;
        }

        System.out.println("Sum of number    : "+sum_ofNumber);
        System.out.println("Average of number: "+average );
    }
}
