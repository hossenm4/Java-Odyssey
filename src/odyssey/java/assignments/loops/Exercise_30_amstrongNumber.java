package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class Exercise_30_amstrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,r,sum,temp;
        int stno,enno;

        System.out.println("Please enter first starting range number:  ");
        stno = input.nextInt();
        System.out.println("Please now enter your ending range number:  ");
        enno = input.nextInt();
        System.out.println("Armstrong numbers within the given range: ");

        for(num=stno;num<=enno;num++){
            temp=num;
            sum = 0;

            while(temp!=0){
                r=temp % 10;
                temp=temp/10;
                sum=sum+(r*r*r);
            }
            if(sum==num)
                System.out.println(num);
        }
        System.out.println("\n");


    }
}
