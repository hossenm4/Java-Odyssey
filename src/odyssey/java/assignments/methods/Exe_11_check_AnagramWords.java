package src.odyssey.java.assignments.methods;

import java.util.Arrays;
import java.util.Scanner;

public class Exe_11_check_AnagramWords {
    public static void anagramDamo(String intPutWord1, String inPutWord2){

        char array1[] = intPutWord1.toCharArray();
        char array2[] = inPutWord2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

       if( Arrays.equals(array1,array2)){
           System.out.println("words you enter, are anagram words");
       }else{
           System.out.println("words you enter, are not anagram words");
       }

    }

    public static void main(String[] args) {
        String intPutWord1, inPutWord2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first word to check if it is anagram or not. ");
        intPutWord1 = sc.nextLine();
        System.out.println("Please enter your second word to check if it is anagram or not. ");
        inPutWord2 = sc.nextLine();
        anagramDamo(intPutWord1,inPutWord2);
    }
}
