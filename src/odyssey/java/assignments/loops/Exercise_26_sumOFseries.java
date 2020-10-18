package src.odyssey.java.assignments.loops;

import javax.swing.*;
import java.util.Scanner;

public class Exercise_26_sumOFseries {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter terms number: ");


        int x=1, y=1, j = 1, sum =0, terms =scanner.nextInt();

        while(x<=terms){
            System.out.print(y);
            x++;
            if(x<=terms){
                System.out.print(" +");
                y = (y*10)+1;
                sum = sum + y;
            }
        }
        System.out.println("\nSeries of sum: "+sum);
    }
}
