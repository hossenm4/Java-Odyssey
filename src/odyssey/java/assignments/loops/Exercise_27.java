package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class Exercise_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter terms number: ");

        int k = 1, i = 0, sum = 0, d=0, terms = scanner.nextInt();

        System.out.println("Positive divisor are: ");

        while (i <= terms) {
            i++;
            if (terms % i == 0) {
                 d = i;
                System.out.print(" "+i);
                sum = sum + i;
            }

        }
        System.out.println("\nSum of divisor: "+sum);
    }
}

