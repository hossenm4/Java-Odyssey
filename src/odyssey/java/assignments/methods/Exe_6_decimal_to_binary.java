package src.odyssey.java.assignments.methods;

import java.util.Scanner;

public class Exe_6_decimal_to_binary {

    public static void decimalTObinary(int inputDecimalNum) {

        int index = 0;

        int array [] = new int[20];

        while( inputDecimalNum > 0){
            array[index] = inputDecimalNum % 2;
            index++;
            inputDecimalNum = inputDecimalNum/2;

        }
        for(int j =index-1 ; j>=0 ; j--){
            System.out.print(array[j]);
        }
    }

    //Main method;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inputDecimalNum;

        System.out.println("please enter your decimal number to get binary number: ");
        inputDecimalNum = sc.nextInt();
        decimalTObinary(inputDecimalNum);
    }
}

