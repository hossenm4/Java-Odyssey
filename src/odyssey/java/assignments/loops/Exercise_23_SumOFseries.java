package src.odyssey.java.assignments.loops;

public class Exercise_23_SumOFseries {

    public static void main(String[] args) {

        float x, sum,no_row;
        x=3;
        sum=1;
        no_row = 1;
        int i,n;
        i =1;
        n=5;
        while(i<=n){

            no_row = no_row*x/(float)i;
            sum = sum+no_row;
            i++;

        }
        System.out.println("Sum of serious: "+sum);
    }
}
