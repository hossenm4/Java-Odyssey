package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class Exercise_3_Nterms_of_naturalNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum_of_total, input;
        sum_of_total = 0;

        System.out.println("Please enter your favorite natural numbers");
        input = in.nextInt();
        System.out.print("The first"+input+" natural number is: ");

        for(int sum1 =1; sum1<=input;sum1++){
            System.out.print(" "+sum1);
            sum_of_total = sum_of_total+sum1;
        }
        System.out.println("\nThe Sum of Natural Number upto 7 terms :"+sum_of_total);
    }
}
