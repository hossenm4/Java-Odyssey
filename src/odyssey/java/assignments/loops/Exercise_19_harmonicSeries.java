package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class Exercise_19_harmonicSeries {
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your terms number: ");

        int i,termsNumber;
        i = 1;
        termsNumber = scanner.nextInt();

        while(i <=termsNumber ){
            System.out.print(" 1/" +i+"+");
            i++;
        }
    }
}







