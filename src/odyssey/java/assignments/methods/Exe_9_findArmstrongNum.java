package src.odyssey.java.assignments.methods;

import java.util.Scanner;

public class Exe_9_findArmstrongNum {

    public static void findArmstrong(int inputNum){

        int sum, originalNum, d1, d2, d3;
        originalNum = inputNum;

        d1 = inputNum % 10;
        inputNum = inputNum/10;

          d2 = inputNum % 10;
        inputNum = inputNum/10;

        d3 = inputNum;

        sum = (int)(Math.pow(d1,3)+Math.pow(d2,3)+Math.pow(d3,3));

        if(originalNum == sum){
            System.out.println("The number you enter is armstrong.");
        }else{
            System.out.println("The number you enter is not armstrong.");
        }
    }

    public static void main(String[] args) {
        int inputNum;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number to check if it is armstrong or not: ");
        inputNum = sc.nextInt();
        findArmstrong(inputNum);
    }
}
