package src.odyssey.java.assignments.methods;

public class Exe_5_sumOFseries {

    public static int sumOFseries(){

        int sum = 0;

        sum = (1*1)/1+(2*1)/2+(3*2*1)/3+(4*3*2*1)/4+(5*4*3*2*1)/5;
        return sum;
    }

    public static void main(String[] args) {
        int totalsum;

        totalsum = sumOFseries();
        System.out.println("The sum of the series is: "+totalsum);

    }
}
