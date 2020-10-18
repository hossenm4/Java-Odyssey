package src.odyssey.java.assignments.loops;

public class Exercise_20_pyramid {

    public static void main(String[] args) {


        for(int i = 0; i<=3; i++){
            for(int j = 1; j<=4-i; j++) {
                System.out.print(" ");
            }
                    for(int x = 1 ; x<=2*i-1; x++){
                        System.out.print("*");

                    }
                    System.out.println();
                }

            }


        }

