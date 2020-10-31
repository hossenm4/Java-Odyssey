package src.odyssey.java.assignments.methods;

import java.util.Scanner;

public class Exe_10_FindPerfectNumm {

    public static int FindPerfectNum(int inputNum){
        int sum=0;

        for(int i =1; i < inputNum; i++) {
            if (inputNum % i == 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int inputNum, returnSum, originalNum;

        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your number to check if it is perfect number or not: ");
        inputNum = sc.nextInt();
        originalNum = inputNum;



        returnSum = FindPerfectNum(inputNum);
        System.out.println("Sum of dividers: "+ returnSum);

        if(originalNum ==  returnSum){
            System.out.println("And The number you enter is a perfect number.");
        }else{
            System.out.println("And The number you enter is not a perfect number.");
        }

    }
}
