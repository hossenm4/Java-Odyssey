package src.odyssey.java.assignments.loops;

public class Exercise_21_sumOFserise {

    public static void main(String[] args) {

        int sum,y,t,j;
        sum = 0;
         t = 9;
         j =0;

        for (int x = 1; x <= 5 ; x++) {
            sum = t;
            System.out.print(" " +t+"\n");
            t = t * 10 + 9;
            j = j +t;
        }
        System.out.println("sum of numbers: "+j);
    }
}

