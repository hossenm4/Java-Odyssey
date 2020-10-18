package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class Exercise_15_factorialNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number for it factorial: ");

        int i, factorialNum,sum;
        i = 1;
        sum = 1;
        factorialNum=scanner.nextInt();


        while(i <= factorialNum){
            System.out.println(i);
            sum = sum*i;
                i++;
        }
        System.out.println("Sum of factorial numbers is:"+sum);
    }
}