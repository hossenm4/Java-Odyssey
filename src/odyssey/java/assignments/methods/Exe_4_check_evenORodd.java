package src.odyssey.java.assignments.methods;

import java.util.Scanner;

public class Exe_4_check_evenORodd {

    public static void evenORodd(int inputNum) {

        if(inputNum % 2==0){
            System.out.println("The number you enter is even: ");
        }else{
            System.out.println("The number you enter is odd: ");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum;

        System.out.println("Please enter your number to check even or odd: ");
        inputNum = sc.nextInt();
        evenORodd(inputNum);
    }
}
