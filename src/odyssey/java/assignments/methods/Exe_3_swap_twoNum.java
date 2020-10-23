package src.odyssey.java.assignments.methods;

import java.util.Scanner;

public class Exe_3_swap_twoNum {

    public static void swapNum(int inputNum1, int inputNum2) {

        int n1,  n2, sum =0;

        n1 = inputNum1;
        n2 = inputNum2;

        System.out.println("Before swapping: "+"n1 = "+n1+","+" n2 = "+n2);
        System.out.println("After swapping: "+"n1 = "+n1*n1+","+" n2 = "+n2/2);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum1, inputNum2 ;

        System.out.println("Please enter your first number: ");
        inputNum1 = sc.nextInt();

        System.out.println("Please enter your second number: ");
        inputNum2 = sc.nextInt();
        swapNum(inputNum1,inputNum2);
    }
}