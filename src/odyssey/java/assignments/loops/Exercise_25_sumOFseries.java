package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class Exercise_25_sumOFseries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter terms number: ");

        int terms, square_natural_num, sum, i;
        terms = scanner.nextInt();
        System.out.println("The square natural upto "+terms+" terms are:");
        sum = 0;
        i=1;

        while(i<=terms){
            square_natural_num = i*i;
            sum = sum+square_natural_num;
            System.out.println(square_natural_num);
            i++;
        }
        System.out.println("The Sum of Square Natural Number upto "+terms+" terms: "+sum);
    }
}
