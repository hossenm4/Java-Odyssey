package src.odyssey.java.assignments.loops;

public class Exercise_18_sumOf_series {
    public static void main(String[] args) {


        int i,n;
        i = 1;
        n =5;
        float x, y,z,s,sum;
        z =1;
        sum=1;
        x = 2;
        s = 1;

        while(i<+n){
            z = (2*i)*(2*i-1);
            s = -s*x*x/z;
            sum = sum +s;
            i++;

        }
        System.out.println("sum of series: " +sum+"\nvalue of x: "+x+"\nInput numbers of terms: "+n);
    }
}

