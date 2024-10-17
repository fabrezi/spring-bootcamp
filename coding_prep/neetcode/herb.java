package neetcode;

/*
Select the type of herb: sativa or indica
Select the breed: sativa(sour diesel, OG dark vader) || indica(Blue dream, Afghan Kush)
Select the amount: gram, dub(2g), ounce(28g)
Price/gram: sour(30), OG(20), Blue(10), Afghan(5)
Output the cost: abc
Output: Thank you for your service!!
 */

import java.util.Scanner;

public class herb {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Sativa or Indica?");
        String herb = scan.nextLine();

        if(!herb.equalsIgnoreCase("sativa") && !herb.equalsIgnoreCase("inidica")){
            System.out.println("Please type again");
            return;
        }

        String breed = "";
        if(herb.equals("sativa")){
            System.out.println("Sour or OG");
            breed = scan.nextLine();
            if(!breed.equalsIgnoreCase("sour") && !breed.equalsIgnoreCase("OG")){
                System.out.println("Try again later");
                return;
            }
        } else if(herb.equals("indica")){
            System.out.println("afgan or blue");
            breed = scan.nextLine();
            if(!breed.equalsIgnoreCase("blue") && !breed.equalsIgnoreCase("afghan")){
                System.out.println("Try again later");
                return;
            }

        }

    }
}
