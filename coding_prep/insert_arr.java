import java.util.Scanner;

public class insert_arr {

    public static void main(String [] args){
        int [] arr = {1,2,3,4,5};

        System.out.println("Type an integer: ");
        Scanner scan = new Scanner(System.in);

        for(int i=0; i <= arr.length; i++){
            if(arr[i] == scan.nextInt()){
                System.out.println("BINGO");
            } else {
                System.out.println("We did not find a match.");
                //break;
            }

        }



    }


}
