package src.odyssey.java.assignments.methods;

import java.util.Scanner;

public class Exe_12_find_maximumAndminimum_OFnum {

    static Scanner sc = new Scanner(System.in);

    public static void arrayIndex(int elementSize){

        int largeNum, lowestNum;

        int array[] = new int[elementSize];


        System.out.println("Please enter elements of array: ");
        for(int i = 0; i < array.length; i++){
            array [i] = sc.nextInt();
        }

        System.out.println("value of Array, 0 index to end index, are: ");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        largeNum = array [0];

        for(int i= 1 ; i < array.length; i++){
            if(largeNum < array[i]){
                largeNum = array[i];
            }
        }
        System.out.print("The largest number is: "+largeNum);


        lowestNum = array[0];

        for(int i= 1 ; i < array.length; i++){
            if(lowestNum >= array[i]){
                lowestNum = array[i];
            }
        }
        System.out.print("\nAnd The lowest number is: "+lowestNum);
    }

    // main method.
    public static void main(String[] args) {

        int elementSize, large;

        System.out.print("please enter element size: ");
        elementSize = sc.nextInt();
        arrayIndex(elementSize);

    }
}
