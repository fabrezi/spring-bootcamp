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

        System.out.println("Select the type of herb: ");

        String input = scan.nextLine();

      while(true){
          if(!input.equalsIgnoreCase("sativa") && !input.equalsIgnoreCase("indica")){
              System.out.println("the value is incorrect, please try again");
              break;
          } else {
              System.out.println("good job");
          }

          scan.close();

      }




    }
}
