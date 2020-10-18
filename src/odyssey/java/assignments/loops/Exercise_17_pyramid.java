package src.odyssey.java.assignments.loops;


public class Exercise_17_pyramid {

    public static void main(String[] args) {
       int rows,spc;
        rows = 5;
        spc=4;

        for(int x = 1; x<=4; x++){
            for(int y = spc; y>=1; y--){
                System.out.print(" ");
            }
            for(int j = 1; j<=x; j++){
                System.out.print(" "+x);
            }
            System.out.println();
            spc--;
        }
    }
}
