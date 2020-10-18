package src.odyssey.java.assignments.loops;

public class Exercise_14_pyramid {


    public static void main(String[] args) {
        int row,spc,x,y,z,k;
        k =4;

        for(x = 1; x<=4; x++){
            for(z=k; z>=1 ; z--){
                System.out.print(" ");
            }
            for(y =1; y<=x; y++){
                System.out.print(" *");
            }
            System.out.println();
            k--;
        }
    }
}


