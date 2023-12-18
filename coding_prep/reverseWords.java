import java.util.Arrays;


public class reverseWords {


    public static void main(String [] args){

       String C = "there is a cat on the mat"; //olleh
       System.out.println("This is the real words= " + C);
       StringBuilder str = new StringBuilder(C);

       StringBuilder flipped = str.reverse();

       System.out.println( "this is the reverse of the words = " + flipped);

       char[] Cha = C.toCharArray();
       Arrays.sort(Cha);

       String sorter = new String(Cha);
       System.out.println(sorter);



    }



}
