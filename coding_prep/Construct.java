import java.io.*;
import java.util.Scanner;

// Class 1
// Helper class
public class Construct   {

    // Member variable of this class
    private String name;
    public int Cost;

    // Method 1 - Getter
    public String getName() { return name; }

    // Method 2 - Setter
    public void setName(String N)
    {

        // This keyword refers to current instance itself
        this.name = N;
    }

    // Main driver method
    public static void main(String[] args)
    {
        // Creating an object of class 1 in main() method
        Construct obj = new Construct();

        Scanner scan = new Scanner(System.in);

        System.out.println("NAme of the book = ");
        String Naam = scan.next();


        // Setting the name by calling setter method
        obj.setName(Naam);
        // Getting the name by calling getter method
        System.out.println(obj.getName());
    }
}
