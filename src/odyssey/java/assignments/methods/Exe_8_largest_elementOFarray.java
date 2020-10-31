package src.odyssey.java.assignments.methods;

import java.util.Arrays;
import java.util.Scanner;

public class Exe_8_largest_elementOFarray {
    static Scanner sc = new Scanner(System.in);

    public static void arrayIndex(int elementSize){

        int large;

        int array[] = new int[elementSize];


        System.out.println("Please enter elements of array: ");
        for(int i = 0; i < array.length; i++){
            array [i] = sc.nextInt();
        }

        System.out.println("value of Array, 0 index to end index, are: ");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        large = array [0];

        for(int i= 1 ; i < array.length; i++){

            if(large < array[i]){

                large = array[i];
            }
        }

        System.out.print("And The largest number is: "+large);
    }

// main method.
    public static void main(String[] args) {

        int elementSize, large;

        System.out.print("please enter element size: ");
        elementSize = sc.nextInt();
        arrayIndex(elementSize);




    }

}
