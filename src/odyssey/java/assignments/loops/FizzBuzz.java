package src.odyssey.java.assignments.loops;

public class FizzBuzz {

    public static void main(String[] args) {

        for (int num1 = 1; num1 <= 20; num1++) {

            if (num1 % 3 == 0) {
                System.out.println("Fizz");

            }else if(num1 % 5 == 0) {
                System.out.println("Buzz");

            }else{
                System.out.println(num1);
            }

        }

    }
}