import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        // System.out.println("Hello World");


        //int Author;
        int [] arr = new int[4];
        //int i = 0;
        int sum = 0;
        int avg = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter values for array = ");
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter values for array = ");
            arr[i] = scan.nextInt();
            sum = sum + arr[i];
            avg = sum / arr.length;
        }
        System.out.println("sum: " + sum);
        System.out.println("average: " + avg);
        for(int j : arr){
            System.out.println(j + " ");
        }

        /*
        int sum = 0;
        int avg = 0;

        for(int j = 0; j < arr.length; j++){
            sum = sum + arr[j];
            avg = sum / arr.length;
        }

        System.out.println(avg);
*/

        //book = scan.next();
        //System.out.println("book price");
        //bookPrice = scan.nextInt();


        //System.out.println("name of the book = " + book);
        //System.out.println("Price of the book = " + bookPrice);

    }

}
