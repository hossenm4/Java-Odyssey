package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class Exercise_5_CubeNumber {

    public static void main(String[] args) {
        System.out.println("Please enter your number for cube number: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int j = 0;

        for(int i =1; i<=inputNumber;i++) {
            j = i*i*i;
            System.out.println("Number is: "+i+" and cube of the 1 is : "+j);
        }
    }
}
