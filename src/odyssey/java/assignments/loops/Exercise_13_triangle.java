package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class Exercise_13_triangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i,s,k,rows,j;
        int t = 1;

        System.out.println("Input number of rows : ");
        rows = in.nextInt();
        s = rows;

        for(i=1; i<=rows; i++){
            for(k=s; k>=1; k--){
                System.out.print(" ");
            }
            for(j = 1; j<=i ; j++){
                System.out.print(" "+t++);
            }
            System.out.println(" ");
            s--;
        }
    }
}
