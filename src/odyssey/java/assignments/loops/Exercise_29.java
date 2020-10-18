package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class Exercise_29 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n,i,sum;
        int mn, mx;

        System.out.println("Please enter first starting range number:  ");
        mn = input.nextInt();
        System.out.println("Please now enter your ending range number:  ");
        mx = input.nextInt();
        System.out.println("The Perfect numbers within the given range: ");

        for(n=mn;n<=mx;n++){
            i=1;
            sum = 0;
            while(i<n){
                if(n%i==0)
                    sum=sum+i;
                i++;
            }
            if(sum==n)
                System.out.print(" "+n);
        }

    }
}
