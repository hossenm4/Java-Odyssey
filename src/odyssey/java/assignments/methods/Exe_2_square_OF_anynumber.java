package src.odyssey.java.assignments.methods;

import java.util.Scanner;

public class Exe_2_square_OF_anynumber {

    public static int SquareNUm(int inputNum){

        int result;
        result= inputNum*inputNum;
        System.out.println("Your square number is: "+result);
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum;

        System.out.println("Please enter your number to get square number: ");
        inputNum = sc.nextInt();
        SquareNUm(inputNum);
    }
}
