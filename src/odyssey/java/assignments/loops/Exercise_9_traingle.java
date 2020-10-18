package src.odyssey.java.assignments.loops;

public class Exercise_9_traingle {

    public static void main(String[] args) {

        for (int num1 = 1; num1 <= 4; num1++) {

            for (int num2 = 1; num2 <= num1; num2++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}