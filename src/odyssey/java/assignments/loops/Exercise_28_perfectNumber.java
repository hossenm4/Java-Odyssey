package src.odyssey.java.assignments.loops;

public class Exercise_28_perfectNumber {
    public static void main(String[] args) {


        int k = 1, i = 0, sum = 0, d=0;

        while (i <= 50) {
            i++;
            if (50 % i == 0) {
                System.out.print(" "+i);
                sum = sum + i;

            }
        }
        System.out.println("\nThe Perfect numbers within the given range: "+sum);
    }
}
