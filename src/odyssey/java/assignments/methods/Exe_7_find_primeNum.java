package src.odyssey.java.assignments.methods;

import java.util.Scanner;

public class Exe_7_find_primeNum {

    public static void checkPrimeNUm(int inputNum) {

        boolean result = true;

        if (inputNum == 0 || inputNum == 1) {
            System.out.println("The number you enter is not prime.");
        } else {
            for (int i = 2; i < inputNum; i++) {
                if (inputNum % i == 0) {
                    System.out.println("The number you enter is not prime.");
                    result = false;
                    break;
                }
            }
            if (result == true ) {
                System.out.println("The number you enter is prime.");
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum;

        System.out.println("please enter your decimal number to get binary number: ");
        inputNum = sc.nextInt();
        checkPrimeNUm(inputNum);
    }
}
