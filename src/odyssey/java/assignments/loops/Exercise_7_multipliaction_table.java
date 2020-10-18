package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class Exercise_7_multipliaction_table {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter any multiplication table number: ");

        int multiplication, sum;
        multiplication = scanner.nextInt();
        sum = 0;

        for (int num1 = 1; num1 <= 10; num1++) {
            sum = num1 * multiplication;
            System.out.println(multiplication + " X " + num1 + "=" + sum);
        }
    }
}
