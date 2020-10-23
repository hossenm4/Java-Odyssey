package src.odyssey.java.assignments.methods;

import java.util.Scanner;

public class Exe_1_sumOFNum {
    public static int sumOFNUm(int inputNum){

        int x ,y, sum =0;
        x = inputNum;
        y =inputNum;
        sum = x +y;
        System.out.println("Sum of Number: "+sum);
        return sum;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum;

        System.out.println("Please enter your first number: ");

        inputNum = sc.nextInt();

        System.out.println("Please enter your second number: ");

        inputNum = sc.nextInt();

        sumOFNUm(inputNum);





    }

}
