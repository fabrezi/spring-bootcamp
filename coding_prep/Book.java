import java.util.Scanner;

public class Book {
    //title > 4 characters
    //price: 1 to 5000

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        String title = null;
        System.out.println("Add the title" + title);

        int price = 0;

        if (title.length() > 4 && price > 5000) {
            System.out.println("wrong data is inserted");
        } else {
            System.out.println("data is stored");
        }



    }

}
